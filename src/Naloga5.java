import java.util.Scanner;

public class Naloga5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

       int st = 20;
       boolean test = st % 2 == 0 && st % 7 == 0;
       System.out.println(test);

    }
}
