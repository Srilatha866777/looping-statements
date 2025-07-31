package conditionalstatements.looping_statements;

import java.util.Scanner;

public class neonnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n*n;
        int sum=0;
        while (m!=0) {
            int rem=m%10;
             sum=sum+rem;
             m/=10;
        }
        if(sum==n){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not Neon number ");
        }
    }
}
