
// Class definition file: Employee.java
public class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    // Non-parameterized constructor
    public Employee() {
        this.name = "Unknown";
        this.yearOfJoining = 0;
        this.salary = 0.0;
        this.address = "Not Available";
    }

    // Parameterized constructor
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    // Display method to print employee details
    public void display() {
        System.out.printf("%-15s %-15d %-20s\n", name, yearOfJoining, address);
    }
}
