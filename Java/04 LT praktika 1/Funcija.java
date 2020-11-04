public class Funcija {
    public static void main(String[] args) {
        for (int i = -10; i <= 10; i++) {
            System.out.printf("Kai x = %d, tai y = %d%n", i, (7*(int) Math.pow(i, 2)+(5*i)-3));
        }
    }
}
