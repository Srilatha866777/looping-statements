package conditionalstatements.looping_statements;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean flag=true;
        if (n==0||n==1){
            flag=false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
         if(flag){
            System.out.println(n+" prime number");
        }
        else{
            System.out.println(n+" not prime number");
        }

    }
}
