import java.util.Scanner;

public class Kilometrai_metrai_II {
    public static void main(String[] args) {
        Integer km, m, metrai;
        Scanner įvestis = new Scanner(System.in);
        System.out.print("Įveskite kilometrus: ");
        km = įvestis.nextInt();
        System.out.print("Įveskite metrus: ");
        m = įvestis.nextInt();
        metrai = km * 1000 + m;
        System.out.println("\nĮvesti atstumai sudaro " + metrai + " metrus");
        įvestis.close();
    }
}
