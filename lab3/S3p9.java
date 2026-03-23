/*9. Library Management 
Create class Book with title and author. 
Create subclass IssuedBook with issueDate and returnDate. 
     Display issued book details. */
class Book {
    String title;
    String author;

    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

   
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}


class IssuedBook extends Book {
    String issuedTo;
    String returnDate;
    String issueDate;

   
    IssuedBook(String title, String author, String issuedTo,  String issueDate,String returnDate) {
        super(title, author); 
        this.issuedTo = issuedTo;
        this.returnDate= returnDate;
        this.issueDate =  issueDate;
    }

    String issueDate(){
    return issueDate;
    }
    String returnDate(){
        return returnDate;
    }
    
  void displayIssuedBook() {
        displayBook(); 
        System.out.println("Issued To: " + issuedTo);
     System.out.println("Issued date :"+issueDate());
        System.out.println("Returned data :"+returnDate);

    }
}

public class S3p9 {
    public static void main(String[] args) {
        IssuedBook book = new IssuedBook("The Alchemist", "Paulo Coelho", "John","02-2-2026","02-5-2025");
        book.displayIssuedBook();
    }
}