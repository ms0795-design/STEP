import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class TrainConsistManagenemtApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String trainIdPatternString = "TRN-\\d{4}";
        String cargoCodePatternString = "PET-[A-Z]{2}";

        Pattern trainIdPattern = Pattern.compile(trainIdPatternString);
        Pattern cargoCodePattern = Pattern.compile(cargoCodePatternString);

        System.out.print("Enter Train ID: ");
        String trainIdInput = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCodeInput = scanner.nextLine();

        Matcher trainIdMatcher = trainIdPattern.matcher(trainIdInput);
        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCodeInput);

        if (trainIdMatcher.matches()) {
            System.out.println("Train ID " + trainIdInput + " is valid.");
        } else {
            System.out.println("Invalid Train ID: " + trainIdInput + ". Format must be TRN- followed by 4 digits.");
        }

        if (cargoCodeMatcher.matches()) {
            System.out.println("Cargo Code " + cargoCodeInput + " is valid.");
        } else {
            System.out.println("Invalid Cargo Code: " + cargoCodeInput + ". Format must be PET- followed by 2 uppercase letters.");
        }

        scanner.close();
    }
}