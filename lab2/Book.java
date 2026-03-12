/*. Book Class with Constructor Overloading 
Create a class Book with attributes title and price. Implement two constructors: 
one default constructor and one parameterized constructor. Display the book 
details.  */
class Book {

    String title;
    double price;

   
    Book() {
        title = "Unknown";
        price = 0.0;
    }

    Book(String t, double p) {
        title = t;
        price = p;
    }

    void display() {
        System.out.println("Title : " + title);
        System.out.println("Price  : " + price);
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java Programming", 500);

        b1.display();
        b2.display();
    }
}