import java.util.Scanner;

public class Vairuotojas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Integer n, m, k;
        System.out.print("Įveskite dėžių skaičių: ");
        n = read.nextInt();
        System.out.print("Įveskite priekabos talpą: ");
        m = read.nextInt();
        read.close();
        k = (int) Math.ceil((double )n / (double)m);
        System.out.println("Minimalus vežimų skaičius: " + k);
    }
}
