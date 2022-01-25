import java.util.Scanner;

public class Naloga22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vnesi prvo število");
        double a = scanner.nextDouble();


        if (a<0){
            System.out.println("Številka ima predznak - ");
        }else if(a>0){
            System.out.println("Številka ima predznak + ");
        }else{
            System.out.println("Številka nima preznaka");
        }

    }
}
