import java.util.Arrays;

public class TrainConsistManagenemtApp {
    public static boolean binarySearch(String[] bogieIds, String key) {
        Arrays.sort(bogieIds);
        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true;
            } else if (comparison > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] bogies = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String searchKey = "BG309";

        boolean found = binarySearch(bogies, searchKey);
        System.out.println("Bogie Found: " + found);
    }
}