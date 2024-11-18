
// Class definition file: IntegerSet.java
public class IntegerSet {
    private boolean[] set;

    // No-argument constructor to initialize the array to an empty set
    public IntegerSet() {
        set = new boolean[101];
    }

    // Method to insert an element into the set
    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        } else {
            System.out.println("Invalid element. Enter a number between 0 and 100.");
        }
    }

    // Method to delete an element from the set
    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        } else {
            System.out.println("Invalid element. Enter a number between 0 and 100.");
        }
    }

    // Static method to perform union of two sets
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.set.length; i++) {
            resultSet.set[i] = set1.set[i] || set2.set[i];
        }
        return resultSet;
    }

    // Static method to perform intersection of two sets
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < resultSet.set.length; i++) {
            resultSet.set[i] = set1.set[i] && set2.set[i];
        }
        return resultSet;
    }

    // Method to return the set as a string
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                sb.append(i).append(" ");
                isEmpty = false;
            }
        }
        return isEmpty ? "---" : sb.toString().trim();
    }

    // Method to determine if two sets are equal
    public boolean isEqualTo(IntegerSet otherSet) {
        for (int i = 0; i < set.length; i++) {
            if (this.set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }
}
