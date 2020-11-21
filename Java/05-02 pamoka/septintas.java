import java.util.Arrays;
import java.util.Scanner;

public class septintas {
    public static void main(String[] args) {
        int[] seka = pirmas.sekosIvestis(); // sekos ivestis
        Scanner rd = new Scanner(System.in);
        int k = rd.nextInt();
        rd.close();
        int count = 0;
        for (int i = 0; i < seka.length; i++) {
            if (addTerminals(seka[i]) == k) {
                count++;
            }
        }
        System.out.printf("Skaiciu sekoje %s, kur skrastiniu skaitmenu sumos lygios %d, yra %d elementai", Arrays.toString(seka), k, count);
    }

    public static int addTerminals(int a) {
        String num = String.valueOf(a);
        String[] str = num.split("");
        int sum = Integer.parseInt(str[0]) + Integer.parseInt(str[str.length - 1]);
        return sum;
    }
}
