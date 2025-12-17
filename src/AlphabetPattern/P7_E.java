package AlphabetPattern;

/*
        Enter an odd number: 5
        * * * * *
        *
        * * * *
        *
        * * * * *
 */
import java.util.Scanner;

public class P7_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.print("Please enter an odd number!");
            return;
        }
        int mid = num/2+1;
        for (int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==1 || i==num || j==1) {
                    System.out.print("* ");
                    if(i==mid){
                        for(int k=1;k<num-1;k++){
                            System.out.print("* ");
                        }
                }

                }
            }
            System.out.println();
        }
    }
}
