import java.util.Scanner;

public class Laikrodis {
    public static void main(String[] args) {
        Integer h, m, s, h1, m1, s1; 
        String[] laikas;
        Scanner įvestis = new Scanner(System.in);
        System.out.print("Kokį laiką rodo laikrodis?[hh:mm:ss]: ");
        laikas = įvestis.next().split(":");
        h = Integer.parseInt(laikas[0]);
        m = Integer.parseInt(laikas[1]);
        s = Integer.parseInt(laikas[2]);
        
        s1 = (h*3600+m*60+s+5)%60;
        m1 = ((int)java.lang.Math.floor((h*3600+m*60+s+5)/60))%60;
        h1 = (int)java.lang.Math.floor((h*3600+m*60+s+5)/3600);
        System.out.println("Laikas po penkių sekudžių: " + h1 + ":" + m1 +":"+s1);
        įvestis.close();
    }
}