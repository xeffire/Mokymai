import java.util.Scanner;

public class uzd0615 {
    public static void main(String[] args) {
        double p = 0;
        double[] arr = Metodai.randomArrDouble(1, 10, 200);
        double avg = Metodai.avg(arr);
        System.out.printf("%.2f €%n", avg);
        System.out.print("Iveskite pabrangimo procenta (Integer tipo): ");
        Scanner rd = new Scanner(System.in);
        p = (rd.nextDouble() / 100) + 1;
        rd.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                arr[i] = arr[i] * p;
            }
        }
        System.out.printf("%.2f €", Metodai.avg(arr));
    }
}
