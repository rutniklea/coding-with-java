import java.util.Scanner;

import static java.lang.Math.random;

public class Naloga36 {

    public static void main(String[] args) {
        int skrita_stevilka;
        skrita_stevilka = (int) ((Math.random() * 99) +1);
        Scanner scanner = new Scanner(System.in);
        int ugani;
        do {
            System.out.println("Vnesi številko med 1-100: ");
            ugani=scanner.nextInt();
            if (ugani == skrita_stevilka)
                System.out.println("BRAVO! Pravilno si uganil/a skrito številko. ");
            else if (ugani < skrita_stevilka)
                System.out.println("Skrita številka je večja od podane številke. Poskusi ponovno. ");
            else if (ugani > skrita_stevilka)
                System.out.println("Skrita številka je manjša od podane številke. Poskusi ponovno. ");
        } while (ugani != skrita_stevilka);

    }
}
