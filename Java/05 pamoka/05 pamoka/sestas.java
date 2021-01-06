import java.util.Scanner;

public class sestas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter side lenght: ");
        System.out.printf("Area of pentagon: %.3f", area(read.nextInt()));
        read.close();
    }

    public static double area(int a) {
        return (0.25 * Math.sqrt(25.0 + (10.0 * Math.sqrt(5))) * a * a);
    }
}
