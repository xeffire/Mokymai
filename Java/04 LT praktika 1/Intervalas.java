import java.util.Scanner;

public class Intervalas {
    public static void main(String[] args) {
        System.out.println("\u001b[31m Iveskite intervalo skaicius atskirtus kableliais (pvz.: [2, 4]) \u001b[37m");
        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        read.close();
        String[] n = input.replaceAll("[^0-9,]", "").split(",");

        for (int i = Integer.parseInt(n[0]); i <= Integer.parseInt(n[1]); i++) {
            System.out.print(i + " ");
        }
    }
}
