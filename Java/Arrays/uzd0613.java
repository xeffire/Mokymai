import java.util.Arrays;

public class uzd0613 {
    public static void main(String[] args) {
        int[] arrD = Metodai.randomArr(-5, 5, 20);
        Metodai.printArr(arrD);
        Integer[] arrE = Metodai.positive(arrD);
        System.out.println(Arrays.toString(arrE));
    }
}
