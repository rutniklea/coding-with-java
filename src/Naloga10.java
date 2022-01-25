import java.util.Scanner;

public class Naloga10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi uro");
        int ura = scanner.nextInt();

        System.out.println("Vnesi minute");
        int min = scanner.nextInt();

        System.out.println("Vnesi sekunde");
        int sek = scanner.nextInt();

        if (ura==1)
            ura =0;
        if (min==60)
            min=0;
        if(sek==60)
            sek=0;

        int stopinj = sek + min + 60 + ura*60 + 60;

       double x = (360.0*stopinj) / (12.0*3600);

        System.out.println("Kot je:  " + x + "  stopinj");

    }
}
