import java.util.Scanner;

public class Saldainiai {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Petriukas gavo saldainių: ");
        int n = read.nextInt();
        int dienos = 0;
        while (true) {
            if (n == 0) {break;}
            System.out.print("Per dieną suvalgė: ");
            int x = read.nextInt();
            if (x <= n) {
                n -= x;
                dienos++;
            } else {
                break;
            }
        } 
        read.close();
        System.out.printf("Petriukui saldainių užteks %d dienoms ir jam liks %d saldainiai.", dienos, n);
    }
}
