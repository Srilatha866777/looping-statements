package conditionalstatements.looping_statements;

public class trianglepattren2 {
       public static void main(String[] args) {
        int n=6;
        for(int i=1;i<=n;i++){
             int stars=i*2;
            for(int j=6;j>i;j--){
               
              System.out.print("-");
            }
            for(int k=1;k<=stars;k++){
               System.out.print("*");
            }
            for(int m=6;m>i;m--){
            System.out.print("-");
            }
            System.out.println();
        } 
    }
       

}