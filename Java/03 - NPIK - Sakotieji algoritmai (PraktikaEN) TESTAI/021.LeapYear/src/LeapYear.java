
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String yes = "Year is a leap year", no ="Year is not a leap year";
        System.out.print("Type a year: ");
        Integer year = reader.nextInt();
        reader.close();
        if (year%4 == 0) {
            if (year%100 == 0 && year%400 != 0) {
                System.out.println(no);
                return;
            }
            System.out.println(yes);
        } else {
            System.out.println(no);
        };
    }
}
