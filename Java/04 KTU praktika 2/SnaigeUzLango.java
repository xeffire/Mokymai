import java.util.Scanner;

public class SnaigeUzLango {
    public static void main(String[] args) {
        System.out.println("\u001b[31m Iveskite, keik snaigių nukrito per  pirmaąją sekundę ir kiek sekundžių snigo. Skaičius atskirkite kableliu (pvz.: [2, 4]): \u001b[37m");
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        read.close();
        String[] n = input.replaceAll("[^0-9,]", "").split(",");
        int s = 0;
        for (int i = 0; i < Integer.parseInt(n[1]); i++) {
            s += Math.pow(2, i)*Integer.parseInt(n[0]);
        }
        System.out.println(s);
    }    
}
