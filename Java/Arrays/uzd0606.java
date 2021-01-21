import java.util.Arrays;
import java.util.Scanner;

public class uzd0606 {
    public static void main(String[] args) {
        int[] array = new int[6];
        Scanner rd = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            array[i] = rd.nextInt();
        }
        rd.close();
        System.out.println(Arrays.toString(array));
    }
}
