import java.util.Scanner;

public class Naloga6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi smerni koelificent");
        double a = scanner.nextDouble();

        System.out.println("Vnesi začetno vrednost");
        double b = scanner.nextDouble();

        double x = (-b)/a;

        System.out.println("Funkcija ima ničlo vrednosti pri x:" + x);

    }

}
