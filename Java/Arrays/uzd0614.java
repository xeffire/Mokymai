import java.util.Scanner;

public class uzd0614 {
    public static void main(String[] args) {
        int[] arrF = Metodai.randomArr(0, 9, 25);
        Metodai.printArr(arrF);
        Scanner rd = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int tmp = 0;
        while(true) {
            System.out.print("Iveskite pirma eiles nr.: ");
            i = rd.nextInt() - 1;
            if(i >= 0 && i < arrF.length) {break;}
            System.out.println("Blogas ivedimas / uz masyvo indexo ribu");
        }
        while(true) {
            System.out.print("Iveskite antra eiles nr.: ");
            j = rd.nextInt() - 1;
            if(j >= 0 && j < arrF.length) {break;}
            System.out.println("Blogas ivedimas / uz masyvo indexo ribu");
        }
        rd.close();
        tmp = arrF[i];
        arrF[i] = arrF[j];
        arrF[j] = tmp;
        Metodai.printArr(arrF);
    }
}
