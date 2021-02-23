import java.util.*;
public class ArmstrongNumber{
   static String armstrongNumber(int n){
        int sum=0 , rem , div = n;
        while(n > 0 ){
            rem = n%10;
            sum = sum+(rem*rem*rem);
            n = n/10;
        }
        if(div == sum)
            return "No. is ArmStrong";
        else
            return "No. is not ArmStrong";
   }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        System.out.println(armstrongNumber(n));
        
    }
}