import java.util.Scanner;

public class Job9 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("entrer un numéro entier");
        int enter = input.nextInt();
        int [] tab = {4,5,7,9,11};
        int som = 0;
        for (int i = 1 ; i < enter ; i++) {
            for (int div : tab) {
                if (i % div == 0) {
                    som += i ;
                }
            }
        }
        System.out.println(som);
    }
}
