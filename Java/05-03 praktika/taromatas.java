import java.util.Scanner;

public class taromatas {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int[] tara = {0, 0, 0};
        System.out.println("Meskite pakuotes");
        String n = rd.nextLine();
        while (!n.equals("0")) {
            if (n.equals("m")) {
                tara[0]++;
            } else if (n.equals("s")) {
                tara[1]++;
            } else if (n.equals("p")) {
                tara[2]++;
            } else {
                System.out.println("Bloga įvestis!");
            }
            n = rd.nextLine();
        }
        printInfo(tara);
        printTotal(tara);
        printMax(tara);
    }    
    public static void printInfo(int[] data) {
        System.out.printf("Metalo: %d; Stiklo: %d; Plastiko: %d;%n", data[0], data[1], data[2]);
    }

    public static void printTotal(int[] data) {
        System.out.printf("Viso grąža: %.2f eur%n", (data[0] + data[1] + data[2]) * 0.1);
    }

    public static void printMax(int[] data) {
        String[] tipas = {"Metalas", "Stiklas", "Plastikas"};
        int max = 0;
        boolean[] maxType = {false, false, false};
        for (int i = 0; i < data.length; i++){
            if (data[i] > max) {maxType[i] = true; max = data[i];}
        }
        for (int i = 0; i < data.length; i++){
            if (data[i] == max) {maxType[i] = true;}
        }
        
        System.out.printf("Daugiausia buvo grąžinta: %s", tipas[maxIndex]);
    }
}
