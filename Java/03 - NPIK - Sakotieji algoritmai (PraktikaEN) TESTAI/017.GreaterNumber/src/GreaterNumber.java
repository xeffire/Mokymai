import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Write first number: ");
        Integer first = reader.nextInt();
        System.out.print("Write second number: ");
        Integer second = reader.nextInt();
        if (first > second) {
            System.out.println("Greater number is: "+first);
        } else if (first < second) {
            System.out.println("Greater number is: "+second);
        } else {
            System.out.println("Numbers are equal!");
        }
        reader.close();
    }
}
