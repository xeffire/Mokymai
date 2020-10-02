import java.util.Scanner;

public class TikVienas {
    public static void main(String[] args) {
        // Paaiškinimas
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";
        System.out.println(yellow + "Visi skaičiai įvedami viena eilute atskyrus tarpais. Galima vesti daugiau nei tris skaičius." + reset);
        //Kodas
        Scanner read = new Scanner(System.in);
        System.out.print("Įveskite skaičius (formatas [1 2 3 ...]): ");
        String line = read.nextLine();
        read.close();
        String[] strNum = line.split(" ");
        Integer count = 0;
        for (Integer i = 0; i < strNum.length; ++i) {
            if (strNum[i].length() == 3) {
                count++;
            }
        }
        switch (count) {
            case 0:
                System.out.println("Nėra triženklių");
                break;
            case 1:
                System.out.println("Vienas triženklis");
                break;
            case 2:
                System.out.println("Du triženkliai");
                break;
            case 3:
                System.out.println("Trys triženkliai");
                break;
            default:
                System.out.println("Daugiau nei trys triženkliai");
                break;
        }
    }
}
