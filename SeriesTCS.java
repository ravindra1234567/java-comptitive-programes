import java.util.*;
public class SeriesTCS{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum=1;
        for(int i=1;i<=n;i++){
            for (int j = n; j >= i; j--) { 
                System.out.print(" "); 
            }
            for(int j=1;j<=i;j++){
                sum = sum*2;
                System.out.print(sum+" ");
            }
            System.out.println(" ");
        }
         
    }
}