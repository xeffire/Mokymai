import java.util.Scanner;

public class penktas {
    public static void main(String[] args) {
        int[] sides = new int[3];
        Scanner read = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.printf("Input side - %d: ", i+1);
            sides[i] = read.nextInt();
        }
        System.out.printf("The area of the triangle is %.3f", area(sides[0], sides[1], sides[2]));
    }

    public static double area(int a, int b, int c) {
        double p = ((double)(a+b+c)/2);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
