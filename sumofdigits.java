package conditionalstatements.looping_statements;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
       for(;n>0;n/=10){
        int rem=n%10;
        sum=sum+rem;
       }
       System.out.println(sum);
    }
}
