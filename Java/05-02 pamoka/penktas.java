import java.util.Arrays;
import java.util.Scanner;

public class penktas {
    public static void main(String[] args) {
        int[] seka = pirmas.sekosIvestis();
        System.out.print("Pagal kuri skaiciu lyginti?: ");
        Scanner rd = new Scanner(System.in);
        int m = rd.nextInt();
        rd.close();
        int count = 0;
        for(int i = 0; i < seka.length; i++){
            int[] skait = iskaid(seka[i]);
            boolean isMatch = false;
            for(int j = 0; j< skait.length; j++) {
                if(skait[j] == m && !isMatch) {
                    isMatch = true;
                } else if(skait[j] == m && isMatch) {
                    count++;
                }
            }
        }
        System.out.printf("Sekoje %s skaiciu su dviem pasikartojanciais %d yra %d elementai", Arrays.toString(seka), m, count);
    }

    public static int[] iskaid(int n){ // iskaido skaiciu i skaimenu masyva
        String num = String.valueOf(n);
        String[] arr = num.split("");
        int[] arrNum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNum[i] = Integer.parseInt(arr[i]);
        }
        return (arrNum);
    }
}


