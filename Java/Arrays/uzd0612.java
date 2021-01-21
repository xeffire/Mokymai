import java.util.Arrays;
import java.util.Scanner;

public class uzd0612 {
    public static void main(String[] args) {
        int[] arrC = Metodai.randomArr(0, 9, 30);
        System.out.println(Arrays.toString(arrC));
        System.out.print("Iveskite saraso nr.: ");
        Scanner rd = new Scanner(System.in);
        while(true){
            int i = (rd.nextInt() - 1);
            if (i >= 0 && i < arrC.length) {
                arrC[i] = 100;
                break;
            }
            System.out.println("Bloga ivestis arba nera tokio saraso numerio");
        }
        rd.close();
        System.out.println(Arrays.toString(arrC));
    }
}
