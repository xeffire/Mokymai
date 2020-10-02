import java.util.Scanner;

public class Trizenklis {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Įveskite skaičių: ");
        Integer n = read.nextInt();
        read.close();
        Integer len = Integer.toString(n).length();
        if (len == 3) {
            System.out.println("Skaičius yra triženklis");
        } else if (len > 3) {
            System.out.println("Skaičius yra didesnis nei triženklis");
        } else if (len < 3 && len > 0) {
            System.out.println("Skaičius yra mažesnis nei triženklis");
        } else {
            System.out.println("Skaičius yra neigiamas");
        }
    }
}
