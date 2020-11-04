import java.util.Scanner;

public class Knyga {
    public static void main(String[] args) {
        System.out.print("Įvekite knygos skyrių skaičių: ");
        Scanner read = new Scanner(System.in);
        int m = read.nextInt();
        read.close();
        int skyriai = m;
        int n = 0;
        while(true) {
            if (n >= m) {
                break;
            } else {
                m -= n;
                n++;
            }
        }
        System.out.printf("Tadas visą knygą perskaitė per %d dienas/ ų. %nTadas visutiniškai per dieną perskaitė %.2f skyrius/ ų.", n, ((double) skyriai/ (double) n));
    }
}
