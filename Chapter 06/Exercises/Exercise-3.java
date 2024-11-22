public class Main {
    public static void main(String[] args) {
        int[] dinoWeights = {1000, 1500, 3000, 5000};
        int lowestWeight = dinoWeights[0];

        for (int i = 1; i < dinoWeights.length; i++) {
            if (lowestWeight > dinoWeights[i]) {
                lowestWeight = dinoWeights[i];
            }
        }
        System.out.println("The smallest dinosaur's weight is: " + lowestWeight + "kg");
    }
}
