package NewPattern;

/*
        Enter a number: 5
            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *
 */
import java.util.Scanner;

public class P1_DiamondPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int nsp = n - 1;
        int nst = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
//        System.out.println(nsp);
//        System.out.println(nst);
        nsp+=2;
        nst -= 4;

//        System.out.println(nsp);
//        System.out.println(nst);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }
            nst -=2;
            nsp+=1;
            System.out.println();
        }

    }
}
