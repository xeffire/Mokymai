import java.util.Scanner;

public class Skaicius {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Įveskite skaičių: ");
        Integer n = read.nextInt();
        read.close();
        if (n > 0) {
            System.out.println("Skaičius teigiamas");
        } else if (n < 0) {
            System.out.println("Skaičius neigiamas");
        } else {
            System.out.println("Skaičius yra nulis");
        }
    }
}
