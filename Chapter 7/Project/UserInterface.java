import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Dinosaur> dinosaur;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.dinosaur = new ArrayList<>();
    }

    public void start() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            handleMenuChoice(choice);
        }
    }

    public void displayMenu() {
        System.out.println("Welcome to Mesozoic Eden Assistant!");
        System.out.println("1. Add Dinosaur");
        System.out.println("2. Check Park Hours");
        System.out.println("3. Greet Guest");
        System.out.println("4. Check Visitors Count");
        System.out.println("5. Manage Staff");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                addDinosaur();
                break;
            case 2:
                checkParkHours();
                break;
            case 3:
                greetGuest();
                break;
            case 4:
                checkVisitorsCount();
                break;
            case 5:
                // manageStaff();
                break;
            case 6:
                System.out.println("Exiting...");
                System.exit(0);
        }
    }

    public void addDinosaur() {
        System.out.println("Enter name of dinosaur: ");
        String name = scanner.nextLine();
        for (Dinosaur dino : dinosaur) {
            if (dino.getName().equals(name)) {
                System.out.println("Error: given name already exist in database.");
                return;
            }
        }
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Enter weight: ");
        double weight = scanner.nextDouble();
        this.dinosaur.add(new Dinosaur(name, age, weight));
    }

    public void checkParkHours() {
        System.out.println("Welcome to Mesozoic Eden. We are open from 08:00 to 20:00");
    }

    private void greetGuest() {
        checkParkHours();
        System.out.println("Mesozoic Eden is safe and secure.");
    }

    private void checkVisitorsCount() {
        System.out.println("Current visitor count is: 102");
    }
}
