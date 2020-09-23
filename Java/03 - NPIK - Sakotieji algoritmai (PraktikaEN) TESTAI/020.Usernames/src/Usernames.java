
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Your username: ");
        String name = reader.nextLine();
        System.out.print("yous password: ");
        String pass = reader.nextLine();
        switch (name) {
            case "alex":
                if (pass.equals("mightyducks")) {
                    System.out.println("You are now logged into the system!");
                } else {
                    System.out.println("username or password was invalid!");
                };
                break;
            case "emily":
                if (pass.equals("cat")) {
                    System.out.println("You are now logged into the system!");
                } else {
                    System.out.println("username or password was invalid!");
                };
                break;
            default:
            System.out.println("username or password was invalid!");
        }
    }
}
