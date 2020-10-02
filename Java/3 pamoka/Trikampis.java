import java.util.Arrays;
import java.util.Scanner;

public class Trikampis {
    public static void main(String[] args) {
        // Paaiškinimas
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";
        System.out.println(yellow + "Visi skaičiai įvedami viena eilute atskyrus tarpais. Galima vesti daugiau nei tris skaičius." + reset);
        //Kodas
        Scanner read = new Scanner(System.in);
        System.out.print("Įveskite kraštinių ilgius(formatas [1 2 3]): ");
        String input = read.nextLine();
        read.close();
        String[] strNum = input.split(" ");
        int[] num = new int[3];
        for(int i =0; i<strNum.length; ++i){
            num[i] = Integer.parseInt(strNum[i]);
        }
        Arrays.sort(num);
        if (num[2]*num[2] == num[1]*num[1] + num[0]*num[0]){
            System.out.println("Galima sudaryti trikampį!");
        } else {
            System.out.println("Trikampio sudaryti negalima!");
        }
    }
}
