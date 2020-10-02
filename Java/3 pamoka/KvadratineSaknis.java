import java.util.Scanner;
import java.lang.Math;

/**
 * KvadratineSaknis
 */
public class KvadratineSaknis {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Įveskite skaičių: ");
        Integer num = read.nextInt();
        read.close();
        if (num >= 0) {
            double sqrt = Math.sqrt((double) num);
            System.out.println("Šaknis: " + sqrt);
        } else {
            System.out.println("Šaknis negalima, nes įvestas neigiamas skaičius");
        }
        
    }
}