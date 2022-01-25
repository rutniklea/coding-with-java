import java.util.Scanner;

public class Naloga25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi prvo število: ");
        int a = scanner.nextInt();

        System.out.println("Vnesi drugo število: ");
        int b = scanner.nextInt();

        System.out.println("Vnesi tretje število: ");
        int c = scanner.nextInt();

        if (a>b && a>c) {
            System.out.println("Največja številka je: " +a );
        }else if (b>c && b>c){
            System.out.println("Največja številka je: " +b );
        }else {
            System.out.println("Največja številka je: " +c );
        }
    }
}
