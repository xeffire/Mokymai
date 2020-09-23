public class Filmas {
    public static void main(String[] args) {
        //h, m - pradžios val ir min; h1, h2 - trukmė val ir min; h2, m2 - pabaigos val ir min
        Integer h, m, h1, m1, h2, m2;
        //Masyvas laikinam laiko saugojimui 
        String[] temp;
        Scanner įvestis = new Scanner(System.in);
        System.out.print("Filmo pradžia [hh:mm]: ");
        //išskaido hh:mm eilutę į [hh, mm] 
        temp = įvestis.next().split(":");
        //priskiria val ir min kintamiesiams ir paverčia skaičiais
        h = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);
        //procedūra kartojasi su laiko trukme
        System.out.print("Filmo trukmė [hh:mm]: ");
        temp = įvestis.next().split(":");
        h1 = Integer.parseInt(temp[0]);
        m1 = Integer.parseInt(temp[1]);
        //paskaičiuoja pabaigos laiką su reklama
        m2 = (h*60 + m + h1*60 + m1 + 30)%60;
        h2 = (int)java.lang.Math.floor((h*60 + m + h1*60 + m1 + 30)/60);
        System.out.println("Filmas pasibaigs: " + h2 + ":" + m2);
        įvestis.close();
    }
}