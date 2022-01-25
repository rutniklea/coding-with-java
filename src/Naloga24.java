import java.util.Scanner;

public class Naloga24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesite x točke:");
        double x1 = scanner.nextDouble();

        System.out.println("Vnesite y točke:");
        double y1 = scanner.nextDouble();

        System.out.println("Vnesite radij:");
        double radij = scanner.nextDouble();

        System.out.println("Vnesite x središča:");
        double x2 = scanner.nextDouble();

        System.out.println("Vnesite y središča:");
        double y2 = scanner.nextDouble();

        double razdalja = Math.sqrt((Math.pow((x2 - x1),2))+(Math.pow((y2-y1),2)));

        if (radij>razdalja){
            System.out.println("Točka se nahaja v krogu.");
        }else {
            System.out.println("Točka se ne nahaja v krogu.");

        }


    }
}
