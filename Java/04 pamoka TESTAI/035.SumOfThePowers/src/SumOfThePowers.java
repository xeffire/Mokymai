
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = reader.nextInt();
        int sum = 0;
        while (n>=0) {
            sum += (int) Math.pow(2, n);
            n--;
        }
        System.out.println(sum);
    }
}
