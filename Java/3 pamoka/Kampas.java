import java.util.Scanner;

public class Kampas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Įvesti kampo dydį: ");
        Integer n = read.nextInt();
        read.close();
        if (n < 0) {
            System.out.println("Kampas negali būti neigiamas");
        } else {
            switch (n) {
                case 90:
                    System.out.println("Kampas status");
                    break;
                case 180:
                    System.out.println("Kampas ištiestinis");
                    break;
                case 360:
                    System.out.println("Kampas pilnutinis");
                    break;
                default:
                    System.out.println("Kampas nežinomas");
                    break;
            }
        }
    }
}
