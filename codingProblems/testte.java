import java.util.*;

public class testte {
    public static void main(String[] args) {
        // Create a HashMap where the value is an ArrayList of Integers
        Map<String, ArrayList<Integer>> employee = new HashMap<>();
        
        // Create an ArrayList for an employee's details
        ArrayList<Integer> emDetails = new ArrayList<>();
        emDetails.add(175); // Example: height in cm
        emDetails.add(30);  // Example: age

        // Add the ArrayList to the HashMap
        employee.put("Has", emDetails);
        
        
        // Print the HashMap
        System.out.println(employee);
    }
}
