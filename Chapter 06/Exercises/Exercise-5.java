public class Main {
    public static void main(String[] args) {
        int[] dinoAges = {12, 20, 8, 100, 40, 99};
        int sum = 0;
        for (int age: dinoAges) {
            sum += age;
        }
        double averageAge = (double) sum / dinoAges.length;
        System.out.println("Average dinosaur age in Mesozoic Eden is: " + averageAge + " years.");
    }
}
