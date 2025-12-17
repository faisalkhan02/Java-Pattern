package AlphabetPattern;

/*
        Enter an odd number: 5
        * * * * *
            *
            *
            *
        * * * * *
 */
import java.util.Scanner;

public class P4_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int num= sc.nextInt();

        if(num%2==0){
            System.out.println("please enter an odd number!");
            return;
        }
        int mid = num/2+1;
        for(int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i==1 || i==num || j==mid){
                    System.out.print("* ");
                }
                else System.out.print("  ");

            }
            System.out.println();
        }


    }
}
