import java.util.Scanner;

public class Naloga33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int vsota = 0;

        System.out.println("Program sesšteva vnešene številke od uporabnika. V kolikor se vnese 0, se program zaključi.\n");

        System.out.println("Vnesi število:" + a);

        while (true) {
            int st = scanner.nextInt();
            vsota += st;
            if (st == 0) break;
        }
        System.out.println("Seštevek vseh števil je: " + vsota);
        }
}
