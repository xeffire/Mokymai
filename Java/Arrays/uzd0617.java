import java.util.Arrays;

public class uzd0617 {
    public static void main(String[] args) {
        int[] arrQ = Metodai.randomArr(0, 9, 5);
        System.out.println(Arrays.toString(arrQ));
        int[] arrY = new int[arrQ.length + 1];
        int k = Metodai.eilesNr(arrQ);
        int x = 9999;
        int j = 0;
        for(int i = 0; i < arrQ.length; i++) {
            if (i == k) {
                arrY[j] = x;
                j++;
            }
            arrY[j] = arrQ[i];
            j++;
        }
        System.out.println(Arrays.toString(arrY));
    }
}
