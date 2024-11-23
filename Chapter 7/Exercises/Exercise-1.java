public class Main {
    public static void main(String[] args) {
        int dinoAge = 20;
        String dinoState = getDinoState(20);
        System.out.println("Dino is in " + dinoState + " stage.");
    }
    public static String getDinoState(int age) {
        if (age < 1) {
            return "Hatching";
        } else if (age < 18) {
            return "Juvenile";
        } else {
            return "Adult";
        }
    }
}
