package conditionalstatements.looping_statements;

import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n<0){
            n=-n;
        }
        else if(n==0){
            count=1;
        }
        for(;n>0;n=n/10){
         count++;
        }
        System.out.println(count);
    }

}