import java.util.Arrays;
import java.util.Scanner;

public class uzd0605 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Scanner rd = new Scanner(System.in);
        int x = rd.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] += x;
        }
        rd.close();
        System.out.println(Arrays.toString(array));
    }
}
