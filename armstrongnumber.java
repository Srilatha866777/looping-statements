package conditionalstatements.looping_statements;

import java.util.Scanner;

public class armstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int origina_number=num;
        int count_digits=0;
        int res=0;
       while (num!=0) {
         count_digits++;
        num/=10;
       }
       int temp=origina_number;
       while (temp!=0) {
        int digit=temp%10;
        res+=Math.pow(digit,count_digits);
        temp/=10;
       }
       if(res==origina_number){
        System.out.println("armstrong");
       }
       else{
        System.out.println("not armstrong");
       }
    }
}

