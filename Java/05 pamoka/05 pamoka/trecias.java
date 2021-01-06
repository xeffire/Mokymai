public class trecias {
    public static void main(String[] args) {
        System.out.println(sum(24266));        
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
}
