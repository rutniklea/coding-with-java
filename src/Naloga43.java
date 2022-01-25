import java.util.Scanner;

public class Naloga43 {
    public static int stevilo_crk(String besedilo){
        int stevec = 0;
        for (int i =0; i < besedilo.length(); i++){
            char crka = besedilo.charAt(i); // iz besedila se dobi črko
            if ((crka >= 'A' && crka <= 'Z') || (crka >= 'a' && crka <= 'z')){
                    stevec +=1;
                }
            }
        return stevec;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi besedilo: ");
        String a = scanner.nextLine(); //vzame celotno besedilo

        System.out.println("Število črk je: " + stevilo_crk(a));
    }
}
