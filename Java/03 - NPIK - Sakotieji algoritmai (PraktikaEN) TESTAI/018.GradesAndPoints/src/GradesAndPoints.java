
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the points: ");
        Integer points = reader.nextInt();
        System.out.println("Grade: ");
        if (0 <= points && points <= 29) {
            System.out.println("failed");
        } else if (30 <= points && points <= 34) {
            System.out.println("1");
        } else if (35 <= points && points <= 39) {
            System.out.println("2");
        } else if (40 <= points && points <= 44) {
            System.out.println("3");
        } else if (45 <= points && points <= 49) {
            System.out.println("4");
        } else if (50 <= points && points <= 60) {
            System.out.println("5");
        } else {
            System.out.println("Wrong input");
        }
        reader.close();
    }
}
