import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        boolean isParkOpen = getParkState();
    }
    public static boolean getParkState() {
        LocalDateTime currentTime = LocalDateTime.now();
        return currentTime.getHour() >= 8 && currentTime.getHour() <= 20;
    }
