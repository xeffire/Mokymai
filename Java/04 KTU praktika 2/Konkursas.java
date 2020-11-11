import java.util.Scanner;

public class Konkursas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Įveskite intervalo pradžią: ");
        int a = read.nextInt();
        System.out.print("Įveskite intervalo pabaigą: ");
        int b = read.nextInt();
        read.close();
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i%6 == 0) {
                count++;
            }
        }
        System.out.printf("Reikalingas marškinėlių skaičius: %d", count);
    }
}
