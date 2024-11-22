public class Main {
    public static void main(String[] args) {
        String[][] seats = {{"Seat 1", "Seat 2"}, {"Seat 3", "Seat 4"}};

        for (int i = 0; i < seats.length; i++) {
            System.out.println("Printing row " + (i + 1) + " seats: ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.println(seats[i][j]);
            }
        }
    }
}
