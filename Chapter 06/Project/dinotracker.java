public class DinoTracker {
    public static void main(String[] args) {
        String[] dinoNames = {"Deinonychus", "Tyrannosaurus", "Velociraptor", "Megalosaurus", "Brachiosaurus", "Jobaria", "Triceratops", "Lesothosaurus", "Minmi", "Euoplocephalus"};
        int[] dinoAges = {12, 50, 8, 99, 100, 41, 50, 20, 25, 12};
        double[] dinoWeights = {1000.0, 550.7, 150.9, 3058.79, 4584.4, 2758.2, 1258.1, 386.0, 550.4, 98.3};
        String[] dinoSpecies = {"Therapod", "Therapod", "Therapod", "Sauropod", "Sauropod", "Sauropod", "Cerapods", "Ornithopod", "Stegosaur", "Stegosaur"};
        int[] dinoEnclosures = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Printing all the dinosaurs in Mesozoic Eden: ");
        for (int i = 0; i < dinoNames.length; i++) {
            System.out.println("Name: " + dinoNames[i]);
            System.out.println("Age: " + dinoAges[i]);
            System.out.println("Weight: " + dinoWeights[i]);
            System.out.println("Specie: " + dinoSpecies[i]);
            System.out.println("Resides in enclosure no. " + dinoEnclosures[i]);
            System.out.println("---------------------------");
        }
        int sumOfAges = 0;
        double sumOfWeights = 0.0;
        for (int j = 0; j < 10; j++) {
            sumOfAges += dinoAges[j];
            sumOfWeights += dinoWeights[j];
        }
        double avgAge = (double) sumOfAges / 10;
        double avgWeight = sumOfWeights / 10;
        System.out.println("Average age of a dinosaur at Mesozoic Eden: " + avgAge + " years.");
        System.out.printf("Average weight of a dinosaur at Mesozoic Eden: %.2f  kg.", avgWeight);
    }
}
