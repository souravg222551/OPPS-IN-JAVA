
// Application file: DistanceApp.java
import java.util.Scanner;

public class DistanceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first distance
        System.out.println("Enter the first distance:");
        System.out.print("Feet: ");
        float feet1 = scanner.nextFloat();
        System.out.print("Inches: ");
        float inches1 = scanner.nextFloat();

        // Input for second distance
        System.out.println("Enter the second distance:");
        System.out.print("Feet: ");
        float feet2 = scanner.nextFloat();
        System.out.print("Inches: ");
        float inches2 = scanner.nextFloat();

        // Create Distance objects
        Distance d1 = new Distance(feet1, inches1);
        Distance d2 = new Distance(feet2, inches2);

        // Sum the distances
        System.out.println("Calculating the sum of the distances...");
        d1.sum(d2);

        scanner.close();
    }
}
