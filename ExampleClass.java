
// Define the first custom exception
class FirstException extends Exception {
    public FirstException(String message) {
        super(message);
    }
}

// Define the second custom exception
class SecondException extends Exception {
    public SecondException(String message) {
        super(message);
    }
}

// Create a class with two methods: f() and g()
public class ExampleClass {
    // Method g() that throws FirstException
    public void g() throws FirstException {
        System.out.println("Inside g(): About to throw FirstException");
        throw new FirstException("Exception from g()");
    }

    // Method f() that calls g() and throws SecondException
    public void f() throws SecondException {
        try {
            System.out.println("Inside f(): Calling g()");
            g();
        } catch (FirstException e) {
            System.out.println("Inside f(): Caught FirstException: " + e.getMessage());
            throw new SecondException("Exception re-thrown as SecondException");
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();
        try {
            System.out.println("Inside main(): Calling f()");
            example.f();
        } catch (SecondException e) {
            System.out.println("Inside main(): Caught SecondException: " + e.getMessage());
        }
    }
}
