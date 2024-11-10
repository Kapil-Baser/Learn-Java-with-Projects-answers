public class Main {
    public static void main(String[] args) {
        double dinoWeight = 3000;
        
        if (dinoWeight < 500) {
            System.out.println("Feed required at least once a day.");
        } else if (dinoWeight < 2000) {
            System.out.println("Feed required at least twice a day.");
        } else {
            System.out.println("Feed required at least three times a day.");
        }
    }
}
