public class Main {
    public static void main(String[] args) {
        double dinosaurTimWeight = 5000;
        double foodPerWeightUnit = 0.5;
        double dinosaurJimWeight = 9000;
        double foodNeededForTim = (dinosaurTimWeight * foodPerWeightUnit);
        double foodNeededForJim = (dinosaurJimWeight * foodPerWeightUnit);
        System.out.println("Food needed for Tim: " + foodNeededForTim + " kg.");
        System.out.println("Food needed for Jim: " + foodNeededForJim + " kg.");
    }
}
