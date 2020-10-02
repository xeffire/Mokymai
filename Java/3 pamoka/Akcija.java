import java.util.Scanner;

public class Akcija {
    public static void main(String[] args) {
        double k;
        Integer vnt;
        Scanner read = new Scanner(System.in);
        System.out.print("Įveskite prekės kainą: ");
        k = read.nextDouble();
        System.out.print("Įveskite prekių kiekį: ");
        vnt = read.nextInt();
        read.close();
        if (vnt > 3) {
            double suma = (double) vnt * k * 0.8;
            System.out.printf("Bendra suma %.2f €", suma);
        } else {
            double suma = (double) vnt * k;
            System.out.printf("Bendra suma %.2f €", suma);
        }
    }
}
