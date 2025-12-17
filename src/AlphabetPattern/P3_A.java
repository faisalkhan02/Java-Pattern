package AlphabetPattern;

/*
        Enter an odd number: 5
          * * *
        *       *
        * * * * *
        *       *
        *       *
 */
import java.util.Scanner;

public class P3_A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.print("Please enter an odd number!");
            return;
        }
        int midL = num / 2+1; // for middle line

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++){
                if(i==1 || j==1 || j==num ||  i==midL ) {
                    if((i==1&&j==1) || (i==1 && j==num)){
                        System.out.print("  ");
                    }
                    else System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
            sc.close();
    }
}

