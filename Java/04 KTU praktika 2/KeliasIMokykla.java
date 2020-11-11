import java.util.Scanner;

public class KeliasIMokykla {
    public static void main(String[] args) {
        System.out.print("Įveskite žingsnių kiekį iki mokyklos: ");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        read.close();
        int sup = 0;
        int spra = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                sup++;
            } else if(i % 10 == 5) {
                spra++;
            }
        }
        System.out.printf("Suplojimų bus: %d%nSpragtelėjimų bus: %d", sup, spra);
    }
}
