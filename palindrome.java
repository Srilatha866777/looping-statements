package conditionalstatements.looping_statements;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        for(int i=n;i>0;){
           int rem=i%10;
           rev=rev*10+rem;
           i=i/10;
        }
        if(rev==n){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
