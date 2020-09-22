import java.util.Scanner;

public class Nezinomo_kampo_didumas {
    public static void main(String[] args) {
        Scanner įvestis = new Scanner(System.in);
        String hr = "-------------------------------------------";
        Integer pirmas, antras, x;
        System.out.println(hr);
        System.out.print("Įveskite pirmo kampo dydį(ribos nuo 0 iki 180): ");
        pirmas = įvestis.nextInt();
        System.out.print("Įveskite antro kampo dydį(ribos nuo 0 iki " + (180 - pirmas) + "): ");
        antras = įvestis.nextInt();
        System.out.println(hr);
        x = 180 - (pirmas + antras);
        System.out.println("Nežinommo kampo dydis x = " + x);
        įvestis.close();
    }
}