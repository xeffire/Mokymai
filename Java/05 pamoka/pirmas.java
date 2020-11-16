public class pirmas {
    public static void main(String[] args) {
        System.out.println(min(2,5,8));
    }

    public static int min(int a, int b, int c){
        int res = a;
        if(b < res) {
            res = b;
        }
        if(c < res) {
            res = c;
        }
        return res;
    }
}
