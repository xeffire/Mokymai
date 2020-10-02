import java.util.Scanner;

public class LyginisSkaicius {
    public static void main(String[] args) {
        java.util.Scanner read = new Scanner(System.in);
        System.out.println("Įveskite skaičius (formatas [1 2 3]): ");
        String line = read.nextLine();
        read.close();
        String[] strNum = line.split(" ");
        Integer[] num = new Integer[strNum.length];
        for(Integer i = 0; i<strNum.length; ++i){
            num[i] = Integer.parseInt(strNum[i]);
        }
        for(Integer i = 0; i<num.length; ++i){
            if(num[i]%2 == 0){
                System.out.println("Taip");
                break;
            } else if (i == num.length-1 && num[i]%2 != 0){
                System.out.println("Ne");
            }
        }
    }
}
