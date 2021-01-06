import java.util.Scanner;

public class pirmas {
    private static int[] n;
    private static int[] ns;
    public static void main(String[] args) {
        int[] num = sekosIvestis();
        //programa
        int count = 0;
        while(num[0] <= num[1]){
            if(num[0]%sum(num[0]) == 0){
                count++;
            }
            num[0]++;
        }
        //isvestis
        System.out.printf("Kiekis skaiciu, kurie dalijasi is intervalo sumos: %d", count);
    }

    public static int sum(int n) {
        String num = String.valueOf(n);
        String[] arr = num.split("");
        int[] arrNum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNum[i] = Integer.parseInt(arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < arrNum.length; i++) {
            sum += arrNum[i];
        }
        return (sum);
    }
    public static int[] sekosIvestis() {        
        //Skaiciu ivestis ir formatavimas
        Scanner read = new Scanner(System.in);
        System.out.print("\u001b[31m Iveskite skaiciu seka. Skaičius atskirkite kableliu (pvz.: [2, 4] arba 3 ,5 ,6): \u001b[37m");
        String input = read.nextLine();
        // read.close();
        String[] str = input.replaceAll("[^0-9,]", "").split(",");
        int[] n = new int[str.length];
        for (int i = 0; i < str.length; i++){
            n[i] = Integer.parseInt(str[i]);
        }
        return n;
    }
}
