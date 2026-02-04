
public class main{
    public static void main(String[]args){
        Motor ver1 = new Motor();
        
        ver1.brand = "Yamaha";
        ver1.version = "Nmax";
        ver1.model = 2024;
        ver1.cc =  155;
        ver1.capacity = '2';
        ver1.condition = "secondHand";


        var ver2 = new Motor();
        
        ver2.brand = "Honda";
        ver2.version = "Adv";
        ver2.model = 2025;
        ver2.cc =  160;
        ver2.capacity = '2';
        ver2.condition = "new";

        ver1.printDetails();
        ver2.printDetails();
    }
}