import java.util.Scanner;

public class Naloga7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi minimalno število:");
        double min = scanner.nextDouble();

        System.out.println("Vnesi maximalno število:");
        double max = scanner.nextDouble();

        System.out.println("Vnesi število:");
        double st = scanner.nextDouble();

        boolean test = min >= st && max <= st;

        boolean test2 = !(min<= st && max >= st); // negacija

        System.out.println(test2);

    }
}
