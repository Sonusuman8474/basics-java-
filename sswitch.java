import java.util.*;

public class sswitch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("press the botton you want to :");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("samosha");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                System.out.println("momoes");
                break;
            case 4:
                System.out.println("roll");
                break;
            case 5:
                System.out.println("fingers");
                break;
            case 6:
                System.out.println("choumine");
                break;

            default:
                System.out.println("were dreaming");

        }
    }

}
