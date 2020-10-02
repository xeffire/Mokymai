import java.util.Scanner;

public class Pazymiai {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Integer n;
        System.out.print("Įveskite pažimį: ");
        n = read.nextInt();
        read.close();
        if (n < 7 && n > 0) {
            n = 1;
        }
        switch (n) {
            case 10:
                System.out.println("Puikiai");
                break;
            case 9:
                System.out.println("Labai gerai");
                break;
            case 8:
                System.out.println("Gerai");
                break;
            case 7:
                System.out.println("Visutiniškai");
                break;
            case 1:
                System.out.println("Reikia pasistengti");
                break;
            default:
                System.out.println("Neleistinas įvertinimas");
                break;
        }
    }
}
