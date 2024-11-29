public class Main {
    public static void main(String[] args) {
        String dinoName = "Tim";
        String visitorName = "Andy";
        System.out.println(personalMessage(dinoName, visitorName));
    }
    public static String personalMessage(String dinoName, String visitorName) {
        return dinoName + " would like to eat you " + visitorName;
    }
