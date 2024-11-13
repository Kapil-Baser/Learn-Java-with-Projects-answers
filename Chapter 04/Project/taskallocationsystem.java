public class Main {
    public static void main(String[] args) {
        String role = "Cleaning";
        int currentTime = 9;
        int safetyRating = 9;

        switch(role)
        {
            case "Feeding":
            {
                if (currentTime >= 6 && currentTime <= 19)
                {
                    System.out.println("Time to feed the dinosaurs.");
                    break;
                }
            }
            case "Cleaning":
            {
                System.out.println("Your task is to clean the enclosures.");
                break;
            }
            case "Security":
            {
                if (safetyRating < 7)
                {
                    System.out.println("Safety rating has fallen below threshold, secure the area.");
                }
                else
                {
                    System.out.println("Your task is to maintain the saftey of area.");
                }
                break;
            }
            default:
            {
                System.out.println("Unknown.");
                break;
            }
        }
    }
}
