import java.util.Scanner;

public class Skaiciuotuvas {
    public static void main(String[] args) {
        // Paaiškinimas
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";
        System.out.println(yellow + "Visi simboliai įvedami viena eilute ir atskirti tarpais. PVZ: 2 + 1. Galimi operatoriai: + - * / %" + reset);
        //Kodas
        Scanner read = new Scanner(System.in);
        System.out.println("Įveskite veiksmą (formatas [1 + 2]): ");
        String line = read.nextLine();
        read.close();
        String[] arr = line.split(" ");
        Integer first = Integer.parseInt(arr[0]);
        String op = arr[1];
        Integer second = Integer.parseInt(arr[2]);
        switch (op) {
            case "+": System.out.printf("%d %s %d = %d", first, op, second, first + second);
            break;
            case "-": System.out.printf("%d %s %d = %d", first, op, second, first - second);
            break;
            case "*": System.out.printf("%d %s %d = %d", first, op, second, first * second);
            break;
            case "/": System.out.printf("%d %s %d = %.2f", first, op, second, (float) first / second);
            break;
            case "%": System.out.printf("%d %s %d = %d", first, op, second, first % second);
            break;
            default: System.out.println("Kažkas negerai");
            break;
        }
    }
}
