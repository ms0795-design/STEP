public class TrainConsistManager {
    private String[] bogies;

    public TrainConsistManager(String[] bogies) {
        this.bogies = bogies;
    }

    public boolean searchBogie(String bogieId) {
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("Search failed: No bogies are currently added to the train.");
        }

        for (String bogie : bogies) {
            if (bogie.equals(bogieId)) {
                return true;
            }
        }
        return false;
    }
}