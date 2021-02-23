import java.util.*;
public class Triangle{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum=1;
        for(int i=1;i<=n;i++){
            for (int j = n; j >= i; j--) 
                System.out.print(" "); 
            
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println(" ");
        }
         for(int i=1;i<=n;i++){
            for (int j =1 ; j<=i; j++) 
                System.out.print(" "); 
            
            for(int j=n;j>=i;j--)
                System.out.print("* ");
                
            System.out.println(" ");
        }
    }
}