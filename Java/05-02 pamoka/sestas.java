import java.util.Arrays;
import java.util.Scanner;

public class sestas {
    public static void main(String[] args) {
        int[] seka = pirmas.sekosIvestis(); // sekos ivestis
        System.out.print("Koks daliklis?: ");
        Scanner rd = new Scanner(System.in);
        int k = rd.nextInt();
        rd.close();
        int count = 0;
        for(int i = 0; i < seka.length; i++) {
            if(dalikliai(i) == 2) {
                count++;
            }
        }
        System.out.printf("Skaiciu sekoje %s, kur dalikliu skaicius yra lygiai %d, yra %d elementai", Arrays.toString(seka), k, count);
    }

    public static int dalikliai(int a) {
        int count = 1;
        for(int i = 2; i <= a; i++) {
            if(a%i == 0) {
                count++;
            }
        }
        return count;
    }
}
