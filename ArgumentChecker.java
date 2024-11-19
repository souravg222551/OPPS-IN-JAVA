
// Define the custom exception
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class ArgumentChecker {
    public static void main(String[] args) {
        try {
            // Check if the number of arguments is less than 5
            if (args.length < 5) {
                throw new CheckArgumentException("Less than 5 arguments provided.");
            }

            // Parse the arguments to integers and calculate their sum
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }

            // Print the sum of the numbers
            System.out.println("The sum of the provided numbers is: " + sum);
        } catch (CheckArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Exception: Please provide valid integers as arguments.");
        }
    }
}
