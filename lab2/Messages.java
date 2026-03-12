/*String Processing Class 
Create a class Message that stores a string. Write methods to display the length of 
the string and its uppercase form.*/

class Messages {
    String st;

    Messages(String s) {
        st = s;
    }

    void display() {
        System.out.println("Length od the string is: " + st.length());
        System.out.println("printing string in uppercase: " + st.toUpperCase());
    }

    public static void main(String[] args) {
        Messages m = new Messages("Mynameis");
        m.display();
    }
}
