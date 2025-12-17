package AlphabetPattern;

/*
        Enter an odd number: 5
        * * * *
        *       *
        * * * *
        *       *
        * * * *
 */
import java.util.Scanner;

public class P9_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int n= sc.nextInt();
        if(n%2==0){
            System.out.print("Please enter an odd number!");
            return;
        }
        int mid = n/2+1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j == 1 || i == 1 || i == n || i == mid || (i > 1 && i < mid || i > mid) && j == n){
                    if((i==1 || i==mid || i==n) && j==n){
                        System.out.print("  ");
                    }
                    else System.out.print("* ");

                }

                    else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
