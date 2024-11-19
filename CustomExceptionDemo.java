
// Define a custom exception class
class MyCustomException extends Exception {
    private String message;

    // Constructor that takes a String argument
    public MyCustomException(String message) {
        this.message = message;
    }

    // Method to print the stored message
    public void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            // Simulate a condition to throw the custom exception
            throw new MyCustomException("This is a custom exception message.");
        } catch (MyCustomException e) {
            // Catch the custom exception and call its method
            System.out.println("Caught the custom exception.");
            e.printMessage();
        }
    }
}
