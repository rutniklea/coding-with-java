import java.util.Scanner;

public class Naloga23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

      System.out.println("Vnesi število (1-7), da dobiš dan v tednu");
        int a = scanner.nextInt();

        if(a==1){
            System.out.println("Ponedeljek");
        }else if(a==2){
            System.out.println("Torek");
        }else if(a==3){
            System.out.println("Sreda");
        }else if(a==4){
            System.out.println("Četrtek");
        }else if(a==5){
            System.out.println("Petek");
        }else if(a==6){
            System.out.println("Sobota");
        }else if(a==7){
            System.out.println("Nedelja");
        }

    }
}
