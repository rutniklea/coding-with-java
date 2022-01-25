import java.util.Scanner;

public class Naloga41 {

    public static int st_besed(String besedilo){
        int stevec =0;
        for (int i = 0; i < besedilo.length(); i++) {
            char c = besedilo.charAt(i);
            if (c == ' ') {
                stevec++;
            }
        }
        return stevec+1;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi besedilo: ");
        String a = scanner.nextLine();

       int b = st_besed(a);

       System.out.println(b);


    }
}
