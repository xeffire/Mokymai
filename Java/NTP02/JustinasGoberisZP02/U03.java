import java.util.Scanner;

public class U03 {
    public static void main(String[] args) {
        int n, s, sk, psk, gs = 0, mod; // n, s, sk, psk - aprasyti salygoje; gs - galutinis skaicius po skaitmenu
                                        // keitimo, mod - skaicius, kuris bus modifikuojamas;
        int[] ps = new int[4]; // skaitmenu masyvas
        String input; // skaitymui skirtas kintamasis
        // klausia pirmos skaiciu poros. Skaito eilute > iskaido skaicius i elementu
        // masyva > konvertuoja i int > priskiria atitinkamam kintamajam n, paskui s.
        Scanner rd = new Scanner(System.in);
        input = rd.nextLine();
        n = Integer.parseInt(input.split(" ")[0]);
        s = Integer.parseInt(input.split(" ")[1]);
        mod = s; // Orginalus skaicius priskiriamas kintamajam, kuris bus modifikuojamas
        // isskaido orginalu skaiciu i skaitmenu masyva
        for (int i = 0; i < 4; i++) {
            ps[3 - i] = mod % 10;
            mod /= 10;
        }
        // klausia skaiciu poru, priskiria sk ir psk, pakeicia ps masyvo skiatmenis
        // pagal sk ir psk
        for (int i = 0; i < n - 1; i++) {
            input = rd.nextLine();
            sk = Integer.parseInt(input.split(" ")[0]);
            psk = Integer.parseInt(input.split(" ")[1]);
            ps[sk - 1] = psk;
        }
        ;
        rd.close();
        // is ps masyvo sudeda skaitmenis i skaiciu ir priskiria gs kintamajam.
        for (int i = 0; i < 4; i++) {
            gs += ps[i] * Math.pow(10, 3 - i);
        }
        // paskaiciuoja ir isveda abs skirtuma
        System.out.println(Math.abs(s - gs));
    }
}
