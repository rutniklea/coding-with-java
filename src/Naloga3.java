import java.util.Scanner;

public class Naloga3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Vnesi pot");
        double a = scanner.nextDouble();

        System.out.println("Vnesi cas");
        double b = scanner.nextDouble();

        double hitrost = a/b;

        System.out.println("Hitrost objekta je: " + hitrost +" m/s");
    }
}
