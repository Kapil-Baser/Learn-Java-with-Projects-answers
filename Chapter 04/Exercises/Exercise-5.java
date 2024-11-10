public class Main {
    public static void main(String[] args) {
        String dinoSize = "XL";

        switch(dinoSize) {
            case "XS":
                System.out.println("This dinosuar reside in a tiny enclosure.");
                break;
            case "S":
                System.out.println("This dinosaur reside in a small enclosure.");
                break;
            case "M":
                System.out.println("This dinosaur reside in a medium size enclosure.");
                break;
            case "L":
                System.out.println("This dinosaur reside in a big enclosure.");
                break;
            case "XL":
                System.out.println("This dinosaur reside in a huge enclosure.");
                break;
            default:
                System.out.println("Unknown.");
                break;
        }
    }
}
