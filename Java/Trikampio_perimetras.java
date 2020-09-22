import java.util.Scanner;

public class Trikampio_perimetras {
    public static void main(String[] args) {
      Scanner įvestis = new Scanner(System.in);
        Integer a, b, c, perimetras;
        System.out.println("Įveskite kraštinės ilgį A:");
        a = įvestis.nextInt();
        System.out.println("Įveskite kraštinės ilgį B:");
        b = įvestis.nextInt();
        System.out.println("Įveskite kraštinės ilgį C:");
        c = įvestis.nextInt();
        įvestis.close();
        System.out.println("Trikampio kraštinės: " + a + " " + b + " " + c);
        perimetras = a + b + c;
        System.out.println("Trikampio perimetras: " + perimetras);
    }
}
