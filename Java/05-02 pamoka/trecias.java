public class trecias {
    public static void main(String[] args) {
        int[] intervalas = pirmas.sekosIvestis(); //Is pirmos uosduoties metodas kuris paklausia intervalo
        for(int i = intervalas[0]; i <= intervalas[1]; i++){
            System.out.print(" "+inverse(i));
        }
    }

    public static int inverse(int a){
        String num = String.valueOf(a);
        String[] str = num.split("");
        String invStr = "";
        for(int i = 0; i <str.length; i++) {
            invStr = invStr.concat(str[str.length-1-i]);
        }

        return Integer.parseInt(invStr);
    }
}
