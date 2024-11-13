public class Main {
    public static void main(String[] args) {
        boolean isHungry = true;
        int hungerLevel = 25;
        do {
            hungerLevel--;
            if (hungerLevel == 0) {
                isHungry = false;
            }
        } while (isHungry);
        System.out.println("Dino is no longer hungry.");
    }
}
