import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Metodai {
    public static int random(int min, int max) {
        return (int)((Math.random() * (max + 1 - min)) + min);
    }

    public static double randomDouble(int min, int max) {
        return Math.random() * (max + 1 - min) + min;
    }

    public static int[] randomArr(int min, int max, int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = random(min, max);
        }
        return arr;
    } 

    public static double[] randomArrDouble(int min, int max, int n){
        double[] arr = new double[n];
        for (int i = 0; i < n; i++){
            arr[i] = randomDouble(min, max);
        }
        return arr;
    } 

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    //Isrenka teigiamus skaicius is masyvo, grazina nauja masyva
    public static Integer[] positive(Integer[] arr) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for(int n : arr) {
            if (n > 0) {tmp.add(n);};
        }
        Integer[] arr1 = new Integer[tmp.size()];
        arr1 = tmp.toArray(arr1);
        return arr1;
    }
    public static Integer[] positive(int[] arr) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for(int n : arr) {
            if (n > 0) {tmp.add(n);};
        }
        Integer[] arr1 = new Integer[tmp.size()];
        arr1 = tmp.toArray(arr1);
        return arr1;
    }

    public static Integer[] negative(int[] arr) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for(int n : arr) {
            if (n < 0) {tmp.add(n);};
        }
        Integer[] arr1 = new Integer[tmp.size()];
        arr1 = tmp.toArray(arr1);
        return arr1;
    }

    public static int zeros(int[] arr) {
        int zeros = 0;
        for (int num : arr) {
            if (num == 0) {zeros++;}
        }
        return zeros;
    }

    public static double avg(double[] arr) {
        double sum = 0;
        for(double n : arr) {
            sum += n;
        }
        return sum / arr.length;
    }

    // eiles nr ivestis
    public static int eilesNr(int[] arr) {
        Scanner rd = new Scanner(System.in);
        int k = 0;
        while (true) {
            System.out.print("Iveskite eiles nr.: ");
            int i = rd.nextInt() - 1;
            if (i >= 0 && i < arr.length) {
                k = i;
                break;
            }
            System.out.println("Bloga ivestis!");
        }
        rd.close();
        return k;
    }
}
