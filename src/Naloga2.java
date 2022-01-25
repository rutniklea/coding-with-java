import java.util.Scanner;

public class Naloga2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi poljubno število");
        double x = scanner.nextDouble();

        boolean pozitivno_st = x > 0;
        System.out.println("Stevilo je pozitivno: " + pozitivno_st + ".");


    }

}

