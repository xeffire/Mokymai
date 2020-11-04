import java.util.Scanner;

public class SkaiciuSeka {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        read.close();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

    }
}
