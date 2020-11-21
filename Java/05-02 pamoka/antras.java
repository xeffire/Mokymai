public class antras {
    public static void main(String[] args) {
        int[] intervalas = pirmas.sekosIvestis();
        int sum = 0;
        for (int i = intervalas[0]; i <= intervalas[1]; i++) {
            sum += pirmas.sum(i);
        }
        System.out.printf("Bendra visu skaitmenu suma: %d", sum);
    }
}
