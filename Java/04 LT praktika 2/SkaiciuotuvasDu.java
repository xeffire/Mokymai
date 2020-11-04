import java.util.Scanner;

public class SkaiciuotuvasDu {
    public static void main(String[] args) {
        System.out.print("Įveskite veiksmą: ");
        Scanner read = new Scanner(System.in);
        int simb = read.nextInt();
        int res = 0;
        String[] op = { "sum", "subtraction", "multiplication", "max", "min" };
        boolean first = true;
        while (true) {
            int n = read.nextInt();
            if (n == 0) {
                break;
            }
            switch (simb) {
                case 1:
                    res += n;
                    break;
                case 2:
                    res -= n;
                    break;
                case 3:
                    if (first) {
                        res = n;
                        first = false;
                    } else {
                        res *= n;
                    }
                    break;
                case 4:
                    if (first) {
                        res = n;
                        first = false;
                    } else {
                        res = Math.max(res, n);
                    }
                    break;
                case 5:
                    if (first) {
                        res = n;
                        first = false;
                    } else {
                        res = Math.min(res, n);
                    }
                    break;
            }
        }
        read.close();
        System.out.printf("%s: %d", op[simb - 1], res);
    }
}
