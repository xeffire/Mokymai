import java.util.Arrays;
import java.util.Scanner;

public class uzd0616 {
    public static void main(String[] args) {
        int[] arrG = Metodai.randomArr(0, 9, 20);
        System.out.println(Arrays.toString(arrG));
        int[] arrH = new int[arrG.length - 1];
        int k = 0;
        Scanner rd = new Scanner(System.in);
        //Ivesetis kartu su patikrinimu
        while (true) {
            System.out.print("Iveskite eiles nr.: ");
            int i = rd.nextInt() - 1;
            if (i >= 0 && i < arrG.length) {
                k = i;
                break;
            }
            System.out.println("Bloga ivestis!");
        }
        rd.close();

        int j = 0;
        for(int i = 0; i < arrG.length; i++) {
            if (i != k) {
                arrH[j] = arrG[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(arrH));
    }
}
