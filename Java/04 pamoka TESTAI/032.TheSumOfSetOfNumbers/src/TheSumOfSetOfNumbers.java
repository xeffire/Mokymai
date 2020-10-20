
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int n = reader.nextInt();
        int sum = 0;
        while (n>0) {
            sum += n;
            n--;
        }
        System.out.println(sum);
    }
}
