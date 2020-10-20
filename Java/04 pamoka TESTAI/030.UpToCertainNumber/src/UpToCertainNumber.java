
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        int read = reader.nextInt();
        int i = 1;
        while(i <= read){
            System.out.println(i);
            i++;
        }
        // Write your code here
        
    }
}
