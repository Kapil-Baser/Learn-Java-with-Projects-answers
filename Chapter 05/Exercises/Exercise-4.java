public class Main {
    public static void main(String[] args) {
        double totalWeight = 0;
        double[] dinoWeight = {3000, 5000, 2500, 6000, 9000};
        for (int i = 0; i < dinoWeight.length; i++) {
            totalWeight += dinoWeight[i];
        }
        System.out.println("Total weight of all dinosaur's in enclosure is: " + totalWeight + " kg.");
    }
}
