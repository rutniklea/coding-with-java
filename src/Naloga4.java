import java.util.Scanner;

public class Naloga4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi višino pravokotnika");
        double visina = scanner.nextDouble();

        System .out.println("Vnesi spodnjo kateto pravokotnika");
        double spodnja_kateta = scanner.nextDouble();

        double ploscina = ((visina*spodnja_kateta) / 2);

        System.out.println("Ploščina je: " + ploscina );
    }
}
