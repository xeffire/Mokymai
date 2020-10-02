import java.util.Scanner;

public class Kvadratas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Įveskite degtukų skaičių: ");
        Integer num = read.nextInt();
        read.close();
        if (num%4 == 0) {
            System.out.println("Kvadratą sudaryti galima");
        } else {
            System.out.println("Kvadrato sudaryti negalima");
        }
    }
    
}
