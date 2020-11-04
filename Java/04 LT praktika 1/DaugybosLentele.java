import java.util.Scanner;

public class DaugybosLentele {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int input = read.nextInt();
        read.close();
        for (int i = 0; i <= input; i++) {
            System.out.printf("%d * %d = %d%n", input, i, input*i);
        }
    }
}
