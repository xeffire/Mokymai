import java.util.Scanner;

public class ketvirtas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = read.nextInt();
        read.close();
        if (leap(year)) {
            System.out.println("Taip");
        } else {
            System.out.println("Ne");
        }
    }

    public static boolean leap(int a) {
        if(a % 4 == 0) {
            if(a % 100 == 0 && a % 400 != 0) {
                return false;
            } else {
                return true;
            } 
        } else {
            return false;
        }
    }
}
