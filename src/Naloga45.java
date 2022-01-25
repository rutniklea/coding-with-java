import java.util.Scanner;

public class Naloga45 {
    public static int stevilo_besed(String besedilo) {
        int stevec = 0;

        for (int i = 0; i < besedilo.length(); i++) {
            char crka = besedilo.charAt(i); // iz besedila dobim črko
            if (crka == ' ') {
                stevec++;
            }
        }
        return stevec + 1;
    }

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

    public static int stevilo_crk(String besedilo) {
        int stevec = 0;

        for (int i = 0; i < besedilo.length(); i++) {
            char crka = besedilo.charAt(i);
            if ((crka >= 'A' && crka <= 'Z') || (crka >= 'a' && crka <= 'z')) {
                stevec += 1;
            }
        }
        return stevec;
    }

    public static int stevilo_znakov(String besedilo) {
        int stevec = 0;

        for (int i = 0; i < besedilo.length(); i++) {
            char crka = besedilo.charAt(i);
            if (crka >= '|' && crka <= '/') {
                stevec += 1;
            }
        }
        return stevec;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi besedilo: ");
        String a = scanner.nextLine();

        int vsota = stevilo_besed(a) + stevilo_crk(a) + stevilo_povedi(a) + stevilo_znakov(a) ;
        System.out.println(vsota);
    }
}