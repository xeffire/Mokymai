import java.util.Scanner;

public class Oro_uostas {
    public static void main(String[] args) {
        Integer h, min, truk, h1, min1;
        Scanner įvestis = new Scanner(System.in);
        System.out.print("Kurią val pakyla lėktuvas?: ");
        h = įvestis.nextInt();
        System.out.print("Kurią min pakyla lėktuvas?: ");
        min = įvestis.nextInt();
        System.out.print("Kiek laiko trunka skrydis?: ");
        truk = įvestis.nextInt();
        h1 = (int) java.lang.Math.floor((h * 60 + min + truk) / 60);
        min1 = ((h*60 + min + truk)%60);
        System.out.println("Lėktuvas nusileis "+ h1 + " val ir " + min1 + " min");
        įvestis.close();
    }
}