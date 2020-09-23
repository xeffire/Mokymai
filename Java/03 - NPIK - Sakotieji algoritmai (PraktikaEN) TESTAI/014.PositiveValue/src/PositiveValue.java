
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Input number:");
        Integer number = reader.nextInt();
        if (number > 0) {
            System.out.println("number is positive");
        } else {
            System.out.println("number is not positive");
        }
        reader.close();
    }
}
