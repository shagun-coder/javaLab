class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class RegistrationForm {
    String name;
    int age;
    String email;

    void register(String n, int a, String e)
            throws InvalidNameException, InvalidAgeException, InvalidEmailException {

        if (n == null || n.isEmpty()) {
            throw new InvalidNameException("Name cannot be empty");
        }

        
        if (a < 18) {
            throw new InvalidAgeException("Age must be at least 18");
        }

      
        if (e == null || !e.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new InvalidEmailException("Invalid email format");
        }

        name = n;
        age = a;
        email = e;

        System.out.println("Registration successful for: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        
    }
}

public class S4p4 {
    public static void main(String[] args) {
        RegistrationForm form = new RegistrationForm();

      
        try {
            form.register("", 17, "invalidemail");
        } catch (InvalidNameException | InvalidAgeException | InvalidEmailException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }

        
        try {
            form.register("Alice", 17, "invalidemail");
        } catch (InvalidNameException | InvalidAgeException | InvalidEmailException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }

   
       
        
        try {
            form.register("Charlie", 22, "charlie@example.com");
        } catch (InvalidNameException | InvalidAgeException | InvalidEmailException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}