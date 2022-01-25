import java.util.Arrays;

public class Naloga48 {

    public static void main(String[] args) {

        int matrika[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int a,b;

        for ( a=0; a <3; a++){
            for(b=0;b<3; b++)
                System.out.println(matrika[b][a]);
        }
    }
}
