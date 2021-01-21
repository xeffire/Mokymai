import java.util.Arrays;

public class uzd0611 {
    public static void main(String[] args) {
        int[] arrB = Metodai.randomArr(0, 9, 20);
        System.out.println(Arrays.toString(arrB));
        int div = 0;
        int sum = 0;
        for (int i = 0; i < 20; i++) {
            if (arrB[i]%3 == 0) {
                div++;
                sum += arrB[i];
            }
        }
        System.out.println(div + " " + sum);
    }
}
