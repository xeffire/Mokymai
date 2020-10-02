import java.util.Scanner;

public class OruStebejimas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Įveskite mėnesį: ");
        Integer men = read.nextInt();
        read.close();
        if (men < 1 || men > 12) {
            men = 5;
        } else {
            men = (int) Math.floor(men / 3);
        }
        switch (men) {
            case 0:
                System.out.println("Žiema");
                break;
            case 1:
                System.out.println("Pavasaris");
                break;
            case 2:
                System.out.println("Vasara");
                break;
            case 3:
                System.out.println("Ruduo");
                break;
            case 4:
                System.out.println("Žiema");
                break;
            default:
                System.out.println("Klaida");
                break;
        }
    }
}
