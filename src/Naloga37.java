import java.util.Scanner;

public class Naloga37 {

    public static void main(String[] args) {

        int st, a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi številko za izris: ");
        st = scanner.nextInt();

        for (a = 1; a <= st; a++) {
            for (b = 1; b <= st; b++) {
                System.out.println("*");
            }
        } System.out.println("");
    }
}

