import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair Car", 56);
        bogieCapacityMap.put("First Class AC", 24);
        bogieCapacityMap.put("General/Unreserved", 90);
        bogieCapacityMap.put("Pantry Car", 0);

        System.out.println("--- Train Inventory: Bogie Capacity Mapping ---");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
        }

        String query = "AC Chair Car";
        if (bogieCapacityMap.containsKey(query)) {
            System.out.println("\nRetrieving data for '" + query + "': " + bogieCapacityMap.get(query) + " seats.");
        }
    }
}