import java.util.Arrays;
import java.util.Scanner;

/**
 * StovejimoMokestis
 */

 /**
  * melynoji: 8 - 24h, min 12min - 0.5eur, visa savaite
    raudonoji: 8 - 22h, min 12min - 0.30eur, pirmadienis-sestadienis
    geltonoji: 8 - 20h, min 10min - 0.10eur, pirmadienis sest
    zalioji: 8 - 18h, min 20min - 0.10eur, pirm - sest
  *
  */
public class StovejimoMokestis {

    public static void main(String[] args) {
        String[] data = uzklausa();
        System.out.println(Arrays.toString(data));
    }

    public static String[] uzklausa() {
        String[] input = new String[4]; //0 - zona, 1 - pradzios laikas, 2 - pabaigos laikas, 3 - savaites dienos
        //Serija klausimu
        Scanner rd = new Scanner(System.in);
        System.out.print("\u001b[31mĮrašykite, kurioje zonoje statote autobomilį (priimama pilna žodžio forma arba spalvos pirma raide): \u001b[37m");
        input[0] = rd.nextLine();
        System.out.print("\u001b[31mĮveskite stovėjimo pradžios laiką minutės tikslumu. Valandą ir minutę atskirkite dvitaškiu (pvz. 18:00): \u001b[37m");
        input[1] = rd.nextLine();
        System.out.print("\u001b[31mĮveskite stovėjimo pabaigos laiką minutės tikslumu. Valandą ir minutę atskirkite dvitaškiu (pvz. 19:00): \u001b[37m");
        input[2] = rd.nextLine();
        System.out.print("\u001b[31mĮveskite nuo-iki savaitės dienas, kuriomis buvo statomas automobilis (jei buvo statomas tik tai pačiai dienai, įrašykite tik tą žodį): \u001b[37m");
        input[3] = rd.nextLine();
        rd.close();
        //atsakymu performatavimas i naudojama formata
        for(int i = 0; i < 4; i++){
            if (i == 0) {
                System.out.println("doing color");
                input[i].replace("/^[mM].*/", "M");
                input[i].replace("/^[rR].*/", "R");
                input[i].replace("/^[gG].*/", "G");
                input[i].replace("/^[zZžŽ].*/", "Z");
            } else if (i == 1 || i == 2 ) {
                System.out.println("doing time");
                input[i] = input[1].replaceAll("/[^0-9]/", "");
            } else {
                System.out.println("doing day");
                input[i].replace("/^Pirm.*|^pirm.*/", "PR");
                input[i].replace("/^[Aa].*/", "A");
                input[i].replace("/^[Tt]*/", "T");
                input[i].replace("/^[Kk].*/", "K");
                input[i].replace("/^Penk.*|^penk.*/", "P");
                input[i].replace("/^Sest.*|^sest.*|^[Šš].*/", "S");
                input[i].replace("/^Sek.*|^sek.*/", "SK");
            }
        }
        return input;
    }
}