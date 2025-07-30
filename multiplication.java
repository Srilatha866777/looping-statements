package conditionalstatements.looping_statements;

import java.util.Scanner;

public class multiplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
          int mul=i*n;
          System.out.println(n+"X"+i+"="+mul);
        }
       
    }
}
