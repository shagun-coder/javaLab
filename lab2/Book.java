/* Book Class with Constructor Overloading */

class Book {

    String title;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
        System.out.println("------------------");
    }

    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java Programming", 500);

        b1.display();
        b2.display();
    }
}