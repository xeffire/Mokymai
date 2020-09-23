import java.util.Scanner;

public class Saldainiai {
    public static void main(String[] args) {
        Integer n, m, s, k;
        Scanner įvestis = new Scanner(System.in);
        System.out.print("Saldainių kiekis: ");
        m = įvestis.nextInt();
        System.out.print("Mokinių kiekis kiekis: ");
        n = įvestis.nextInt();
        s = (int)java.lang.Math.floor(m/n);
        k = m%n;
        System.out.println("\nMokiniai gavo po " + s + " saldainių; Mokytojai liko " + k +" saldainis/ės.");
        įvestis.close();
    }
}
