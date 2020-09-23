import java.util.Scanner;

public class Savaites {
    public static void main(String[] args) {
        Integer dienos, sav;
        Scanner įvestis = new Scanner(System.in);
        System.out.print("Įveskite dienų skaičių nuo metų pradžios: ");
        dienos = įvestis.nextInt();
        sav = (int) java.lang.Math.floor(dienos / 7);
        System.out.print("Nuo metų pradžios praėjo " + sav + " savaitės");
        įvestis.close();
    }
}
