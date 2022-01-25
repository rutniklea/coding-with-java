import java.util.Scanner;

public class Naloga42 {
    public static int stevilo_povedi(String besedilo) {
        int stevec = 0;

        for (int i = 0; i < besedilo.length(); i++) {
            char crka = besedilo.charAt(i);
            if (crka == '!' || crka == '.' || crka == '?') {
                stevec += 1;
            }
        }
        return stevec;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi besedilo: ");
        String a = scanner.nextLine();

        System.out.println("Število povedi je: " + stevilo_povedi(a));
    }
}
