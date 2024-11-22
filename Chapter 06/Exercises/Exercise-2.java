public class Main {
    public static void main(String[] args) {
        int[] dinoWeights = {1000, 1500, 3000, 5000};
        int maxWeight = dinoWeights[0];

        for (int i = 1; i < dinoWeights.length; i++) {
            if (maxWeight < dinoWeights[i]) {
                maxWeight = dinoWeights[i];
            }
        }
        System.out.println("The heaviest dinosaur's weight is: " + maxWeight + "kg");
    }
}
