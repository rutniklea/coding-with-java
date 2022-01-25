import java.util.Scanner;

public class Naloga32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ste = 0; // dolocimo začetno vrednost 0

        while (true){
           int st = scanner.nextInt(); // od uporabnika dobiš številko
           if(st>0) {
               ste++; // stevec poveca za eno
           } if(st==0) {
               break;
            }

        }
        System.out.println("Število pozitivnih je: " + ste);

    }
}
