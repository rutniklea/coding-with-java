import java.util.Scanner;

public class Naloga46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi število: ");
        double n = scanner.nextDouble();

        System.out.println(fakulteta(n));
    }
    public static int fakulteta(double x) {
        int produkt =1;

        for (int i=1; i <= x; i++) {
            produkt*=i;
        }
        return produkt;
    }


}
