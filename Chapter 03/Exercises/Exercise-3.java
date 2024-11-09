public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;
        boolean isLeapYear = currentYear % 4 == 0 && (currentYear % 100 != 0 || currentYear % 400 == 0);
        System.out.println("Is current year a leap year: " + isLeapYear);
    }
}
