public class Main {
    public static void main(String[] args) {
        String dino = "Tyrannosaurus";
        switch (dino) {
            case "Tyrannosaurus": {
                System.out.println("Tyrannosaurus lives up to its reputation as one of the most fearsome animals of all time. Its powerful jaws had 60 teeth, each one up to 20cm (8 inches) long and its bite was around 3 times as powerful than that of a lion.");
                break;
            }
            case "Allosaurus": {
                System.out.println("The apex predator of late Jurassic North America.");
                break;
            }
            default: {
                System.out.println("Unknown.");
                break;
            }
        }
    }
}
