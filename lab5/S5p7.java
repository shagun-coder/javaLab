// ?7. Throw Exception for Invalid Age 
// Create a method that accepts age. If age < 18, throw an exception with message "Not 
// eligible". 
// Concepts: throw, custom validation
public class S5p7 {
   

    public static void checkAge(int age){
        if(age < 18){   throw new IllegalArgumentException("Not eligible");
        }
        else{
            System.out.print("Eligible");
        }
    }
    
    public static void main(String[] args) {
        try {
            checkAge(15);
        }
         catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }
    }
    
    
}
