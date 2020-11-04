import java.util.Scanner;

public class Degalai {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Įveskite kuro bako talpą: ");
        int t = read.nextInt();
        System.out.print("Įveskite kuro sąnaudas: ");
        int n = read.nextInt();
        read.close();
        int dienos = 0;
        boolean run = true;
        while (run) {
            switch (dienos % 2) {
                case 0:
                    if (t >= n) {
                        t -= n;
                    } else {
                        run = false;
                    }
                    break;
                case 1:
                    if (t >= 2 * n) {
                        t -= 2 * n;
                    } else {
                        run = false;
                    }
            }
            if (run) {
                dienos++;
            } else {
                continue;
            }
        }
        System.out.printf("Keliauti bus galima %d dienų /as /ą", dienos);
    }
}
