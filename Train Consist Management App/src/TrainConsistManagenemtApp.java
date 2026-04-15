import java.util.Arrays;

public class TrainConsistManagenemtApp {
    public static void main(String[] args) {
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        Arrays.sort(bogieTypes);

        System.out.println(Arrays.toString(bogieTypes));
    }
}