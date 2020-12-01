import java.util.Scanner;

public class U05 {
    public static void main(String[] args) {
        int n;
        String input;
        Scanner rd = new Scanner(System.in);
        n = Integer.parseInt(rd.nextLine());
        int[] pirmo = new int[n / 2], antro = new int[n / 2]; // deklaruojami du masyvai - pirmo ir antro zaidejo
                                                              // skaiciai. masyvo ilgiai yra puse n.
        // Klausiama pirmo ir antro zaideju skaiciu iki kol pilnai 'uzpildomos
        // korteles'.
        for (int i = 0; i < n / 2; i++) {
            input = rd.nextLine();
            pirmo[i] = Integer.parseInt(input.split(" ")[0]);
            antro[i] = Integer.parseInt(input.split(" ")[1]);
        }
        rd.close();
        // Isrenkama auksciausia korteliu suma
        int max = 0; // didziausia suma
        int maxIndex = 0; // didziausios poros indeksas
        for (int i = 0; i < n / 2; i++) {
            if (pirmo[i] + antro[i] > max) {
                max = pirmo[i] + antro[i];
                maxIndex = i;
            }
        }
        // isvedama laimeta pora
        System.out.printf("%d %d %d%n", pirmo[maxIndex], antro[maxIndex], max);
        // nusprendziama ir isvedama, kuris zaidejas laimejo
        System.out.println(pirmo[maxIndex] > antro[maxIndex] ? "1" : "2");
    }
}
