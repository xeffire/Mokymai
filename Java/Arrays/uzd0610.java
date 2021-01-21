import java.util.Arrays;

public class uzd0610 {
    public static void main(String[] args) {
        int[] arrA = Metodai.randomArr(0, 9, 12);
        System.out.println(Arrays.toString(arrA));
        int zeros = 0;
        for (int num : arrA) {
            if (num == 0) {zeros++;}
        }
        System.out.println(zeros);
    }   
}