public class DinoMealPlanner {
    public static void main(String[] args) {
        int tRexPerMeal = 100;
        int brachiosaurusPerMeal = 250;
        for (int currentTime = 0; currentTime < 24; currentTime++) {
            if (currentTime == 8 || currentTime == 12 || currentTime == 18) {
                System.out.println("It's " + currentTime + ":00 - Feeding time for T-Rex with " + tRexPerMeal + "kg of food.");
            } else if (currentTime == 7 || currentTime == 11 || currentTime == 19) {
                System.out.println("It's " + currentTime + ":00 - Feeding time for Bracchiosaurus with " + brachiosaurusPerMeal + "kg of food.");
            }
        }
    }
}
