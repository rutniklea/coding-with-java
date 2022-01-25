import java.util.Scanner;

public class Naloga49 {

    public static void main(String[] args) {

        int[][] matrika = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int a, b;

        for (a = 0; a < 3; a++) {
            for (b = 0; b < 3; b++)
                System.out.println(matrika[a][b] + "\n" + " ");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi število, ki se prišteje dani matriki: \n\n");
        int n = scanner.nextInt();

        int c, d;
        for (c = 0; c < 3; c++) {
            for (d = 0; d < 3; d++)
                System.out.println(matrika[c][d] * n + "\n");
        }

    }
}
