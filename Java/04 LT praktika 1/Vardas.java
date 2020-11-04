import java.util.Scanner;

public class Vardas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int input = read.nextInt();
        read.close();
        for (int i = input; i > 0; i--) {
            System.out.print("Justinas ");
        }
    }
}
