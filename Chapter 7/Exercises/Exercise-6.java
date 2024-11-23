public class Main {
    public static void main(String[] args) {
        int currentVisitors = 70;
        boolean canWeLetMorePeopleIn = getCapacityStatus(70);
    }
    public static boolean getCapacityStatus(int currentVisitors) {
        return currentVisitors >= 150;
    }
}
