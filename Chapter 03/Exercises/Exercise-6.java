public class Main {
    public static void main(String[] args) {
        int safetyThreshold = 7;
        int currentRating = 10;
        boolean isSafe = currentRating > safetyThreshold;
        System.out.println("Is the park safe?: " + isSafe);
    }
}
