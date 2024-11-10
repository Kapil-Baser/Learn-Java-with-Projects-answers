public class Main {
    public static void main(String[] args) {
        String jobTitle = "Janitor";

        switch(jobTitle) {
            case "Ranger":
                System.out.println("Maintain security of the park.");
                break;
            case "Ticket Master":
                System.out.println("Give tickets.");
                break;
            case "Janitor":
                System.out.println("Clean the floor.");
                break;
            default:
                System.out.println("Get a job.");
                break;
        }
    }
}
