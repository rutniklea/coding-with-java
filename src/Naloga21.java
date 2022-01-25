import java.util.Scanner;

public class Naloga21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi 1. število");
        double a = scanner.nextDouble();

        System.out.println("Vnesi 2. število");
        double b = scanner.nextDouble();

        if (a<b){
            System.out.println("Najmanjšo število je " + a);
        } else {
            System.out.println("najmanjše število je " + b);
        }

    }

}
