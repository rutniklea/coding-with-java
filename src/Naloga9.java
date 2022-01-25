import java.util.Scanner;

public class Naloga9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi koordinato x1: ");
        double x1 = scanner.nextDouble();

        System.out.println("Vnesi koordinato y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Vnesi koordinato x2: ");
        double x2 = scanner.nextDouble();

        System.out.println("Vnesi koordinato y2: ");
        double y2 = scanner.nextDouble();

        double razdalja = Math.sqrt((x2-x1)* (x2-x1) + (y2-y1) *(y2-y1));

        System.out.println("Razdalja med dvema točkoma je: " + razdalja);
    }
}
