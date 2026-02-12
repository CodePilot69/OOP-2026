/*
Activity 4 Task

Make Deposit, Withdraw and Exit functional.
Make proper adjustment to BankAccount.java if necessary.
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // load accounts
        // BankAccount[] accounts;
        ArrayList<BankAccount> accounts = new ArrayList<>();
        loadAccounts(accounts);

        // login
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO JAVA ATM");
        System.out.println("Enter account number to proceed:");
        String acctNo = sc.nextLine();
        System.out.println("Enter PIN:");
        int pin = sc.nextInt();
        sc.nextLine();

        /*
         * CHECKING IF THE ACCOUNT IS PRESENT THEN AUTHENTICATE WITH THE PIN
         * OPTION 1:
         * for(BankAccount a: accounts){
         * if(a.getAcctNo().equals(acctNo)){
         * newSessionUser = a; //assign to new session user if match is found
         * break;
         * }
         * }
         * //try if account exist then check PIN
         * if(newSessionUser != null){
         * if(newSessionUser.getPin() == pin){
         * System.out.println("Welcome...");
         * //begin transaction
         * beginTransaction(newSessionUser);
         * }else{
         * System.out.println("Sorry try again...");
         * }
         * }else{
         * System.out.println("Sorry try again...");
         * }
         * 
         */

        /*
         * public static boolean match(param){
         * return property == param
         * }
         * 
         */
        // OPTION 2
        Optional<BankAccount> newSessionUser = accounts.stream().filter(b -> b.getAcctNo().equals(acctNo)).findFirst();

        if (newSessionUser.isPresent()) {
            if (newSessionUser.get().isValidPin(pin)) {
                System.out.println("Welcome...");
                // begin transaction
                beginTransaction(newSessionUser.get());
            } else {
                System.out.println("Invalid credentials...");
            }
        }

    }

    public static void beginTransaction(BankAccount account) {
        System.out.println("""
                    Menu
                    1. Balance Inquiry
                    2. Deposit
                    3. Withdraw
                    0. Exit

                """);
        System.out.println("Choice: ");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("Current Balance: " + account.getBalance());
                break;
            case 2:
                System.out.println("Enter amount to deposit: ");
                float amt = sc.nextFloat();
                account.deposit(amt);
                System.out.println("New Balance: " + account.getBalance());
                break;
            case 3:
                System.out.println("Enter amount to withdraw: ");
                float Amount = sc.nextFloat();
                if (Amount > account.getBalance()) {
                    System.out.println("Error: Insufficient balance.");
                } else
                    account.withdraw(Amount);
                System.out.println("New Balance: " + account.getBalance());
                break;
            case 0:
                System.out.println("GOODBYEEEEEEEEE");
                System.exit(0);
                break;

                try (BufferedWriter bw = new BufferedWriter(new FileWriter("accounts.csv"))) {
                    bw.write(data.toString());
                    bw.close();
                    System.out.println("File saved...");
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }

    public static void loadAccounts(ArrayList<BankAccount> accounts) {
        try (Scanner reader = new Scanner(new File("accounts.csv"))) {
            reader.nextLine(); // skip the header
            while (reader.hasNextLine()) {
                String[] cols = reader.nextLine().split(",");
                String acctNo = cols[0];
                String fullName = cols[1];
                float balance = Float.parseFloat(cols[2]);
                int pin = Integer.parseInt(cols[3]);

                BankAccount acc = new BankAccount(acctNo, pin, balance, fullName);
                accounts.add(acc);
            }
        } catch (FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}