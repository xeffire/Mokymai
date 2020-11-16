import java.util.Scanner;

// import sun.jvm.hotspot.tools.SysPropsDumper;

public class KaledineEglute {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Kiek egluciu atvezta? ");
        int n = read.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.printf("Iveskite %d eglutes auksti: ", i);
            sum += read.nextInt();
        }
        read.close();
        System.out.printf("Eglutes aukscio vidurkis: %.2f cm", (double) sum/n );
    }
}
