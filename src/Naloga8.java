import java.util.Scanner;

public class Naloga8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi uro:");
        int ura = scanner.nextInt();

        System.out.println("Vnesi minute:");
        int minute = scanner.nextInt();

        System.out.println("Vnesi sekunde:");
        int sec = scanner.nextInt();

        int cas= ura*3600 + minute*60 + sec;
        System.out.println("Skupno število sekund je: "+ cas);
    }
}
