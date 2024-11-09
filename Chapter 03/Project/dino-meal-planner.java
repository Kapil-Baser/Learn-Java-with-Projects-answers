public class DinoMealPlanner {
    public static void main(String[] args) {
        double jimsWeight = 3000;
        double proportionUnitForJim = 0.07;
        int numberOfFeeding = 2;
        double servePerFeeding = (jimsWeight * proportionUnitForJim) / numberOfFeeding;
        System.out.println("Our " + jimsWeight + " kg dinosuar needs to eat " + servePerFeeding * numberOfFeeding + " kg daily, which means we need to serve " + servePerFeeding + " kg per feeding.");
    }
}
