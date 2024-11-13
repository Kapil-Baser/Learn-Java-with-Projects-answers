public class Main {
    public static void main(String[] args) {
        boolean isParameterSafe = true;
        boolean areCamarasWorking = true;
        boolean isVisitorBehaving = false;
        boolean allChecks = false;
        do {
            if (isParameterSafe != true) {
                System.out.println("Making sure the park parameters are safe.");
                isParameterSafe = true;
            } else if (areCamarasWorking != true) {
                System.out.println("Working on fixing the broken camaras.");
                areCamarasWorking = true;
            } else if (isVisitorBehaving != true) {
                System.out.println("A visitor causing trouble, kicking them out.");
                isVisitorBehaving = true;
            }
            if (isParameterSafe == true && areCamarasWorking == true && isVisitorBehaving == true) {
                allChecks = true;
            }
        } while (allChecks != true);

    }
}
