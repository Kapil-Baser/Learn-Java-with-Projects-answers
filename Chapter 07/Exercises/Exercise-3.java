public class Main {
    public static void main(String[] args) {
        int[] dinoAges = {20, 35, 800, 12, 110};
        double averageAge = getAverageAge(dinoAges);
    }
    public static double getAverageAge(int[] dinoAges) {
        int numOfDino = dinoAges.length;
        int sumOfAges = 0;
        for (int age: dinoAges) {
            sumOfAges += age;
        }
        return sumOfAges / (double)numOfDino;
    }
