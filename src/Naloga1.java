import java.util.Scanner;

public class Naloga1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi svoje ime");
        String ime = scanner.next();
        String pozdrav = "Pozdravljeni: " + ime + " ! ";
        System.out.println(pozdrav);
    }

}
