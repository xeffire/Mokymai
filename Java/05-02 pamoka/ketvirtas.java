import java.util.Scanner;

public class ketvirtas {
    public static void main(String[] args) {
        int[] seka = pirmas.sekosIvestis(); //Is pirmos uzduoties metodas kuris paklausia sekos
        System.out.print("Iveskite ieskoma skaiciu: ");
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt();
        rd.close();
        int count = 0;
        for (int i = 0; i < seka.length; i++){
            if (n == pirmas.sum(seka[i])) { //sum() is pirmos uzduoties metodas kuris sudeda skaitmenis
                count++;
            }
        }
        System.out.printf("Sekoje yra %d skaiciai, kuriu skaitmenu suma lygi %d", count, n);
    }
}
