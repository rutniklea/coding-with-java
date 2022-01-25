import java.util.Scanner;


public class Naloga34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        double povprecje=0.0;
        int vsota = 0;

        System.out.println("Program sešteva vnešene številke od uporabnika. V kolikor se vnese 0, se program zaključi.\n");

        System.out.println("Vnesi število:" + a);
        int st = scanner.nextInt();

        while (true) {
            st = scanner.nextInt();
            if (st == 0) break;
            vsota +=st;
            povprecje = (vsota/st);
        }
        System.out.println("Povrečje vseh števil je: " + povprecje);
    }
}
