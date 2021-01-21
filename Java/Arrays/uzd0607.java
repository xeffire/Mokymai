import java.util.Arrays;
import java.util.Scanner;

public class uzd0607 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Scanner rd = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("arr1: ");
            arr1[i] = rd.nextInt();
            System.out.print("arr2: ");
            arr2[i] = rd.nextInt();
        }
        for(int i=0; i < arr1.length; i++) {
            arr1[i] += arr2[i];
        }
        rd.close();
        System.out.println(Arrays.toString(arr1));
    }
}
