package AlphabetPattern;

/*
        Enter an odd number: 5
        * * * * *
        *
        * * * *
        *
        *
 */
import java.util.Scanner;

public class P2_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) { // conform odd number
            System.out.println("Please enter an odd number!");
            return;
        }

        int mid = num / 2 + 1; // for middle row

        // loop for rows
        for (int i = 1; i <= num; i++) {

            // for first row
            if (i == 1) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("* ");
                }
            }
            // for middle row
            else if (i == mid) {
                for (int j = 1; j <= num - 1; j++) {
                    System.out.print("* ");
                }
            }
            // for vertical line
            else {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
