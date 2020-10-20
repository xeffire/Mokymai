import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = reader.nextInt();
        int sum = 1;
        while (n>0) {
            sum *= n;
            n--;
        }
        System.out.println(sum);
    }
}
