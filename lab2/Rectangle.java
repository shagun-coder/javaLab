/*
 * Rectangle Area
 * Create a class Rectangle with length and width. Use a parameterized
 * constructor to
 * initialize the values and write a method to calculate and display the area.
 */
class Rectangle{
    
    int length;
    int breadth;
    
    Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
    int calculateArea(){
        return length*breadth;
    }
   
    void displayArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        r1.displayArea();
    }
 
}

   

