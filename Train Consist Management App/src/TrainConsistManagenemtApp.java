import java.util.*;

public class TrainConsistManagenemtApp {
    public static void main(String[] args) {
        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        trainConsist.add(2, "Pantry Car");

        trainConsist.removeFirst();
        trainConsist.removeLast();

        TreeSet<String> uniqueBogieIDs = new TreeSet<>();
        String[] inputIDs = {"B101", "B105", "B102", "B101", "B103", "B105"};

        for (String id : inputIDs) {
            uniqueBogieIDs.add(id);
        }

        System.out.println("Final Ordered Train Consist: " + trainConsist);
        System.out.println("Unique & Sorted Bogie IDs: " + uniqueBogieIDs);
    }
}