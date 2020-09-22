import java.util.Scanner;

public class Kilometrai_metrai {
    public static void main(String[] args) {
        Integer km, m;
        Scanner įvestis = new Scanner(System.in);
        System.out.print("Įveskite kilometrus: ");
        km = įvestis.nextInt();
        m = km * 1000;
        System.out.println("\nĮvesti kilometrai sudaro " + m + " metrus");
        įvestis.close();
    }
}
