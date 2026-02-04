package practice;

public class Book {
    
        String title;
        String author;
        String isbn;
        String publication;

        public Book(String Booktitle,
               String Bookauthor,
               String Bookisbn,
               String Bookpublication){

                title = Booktitle;
                author = Bookauthor;
                isbn = Bookisbn;
                publication = Bookpublication;

        }

        public Book(){}

        void printBookInfo(){
            System.out.printf("""
                    %s \n %s \n %s \n %s
                    """,title,author,isbn,publication);
        
    }
}
