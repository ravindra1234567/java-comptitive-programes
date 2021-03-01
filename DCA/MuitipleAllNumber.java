import java.util.*;

public class MuitipleAllNumber {

    static int multiply(int num){
        int mul=1;
        while(num>0){
            int rem = num%10;
            mul*=rem;
            num = num/10;
        }
        return mul;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n>0)
         System.out.println(multiply(n));
         else
          System.out.println("Number Invalid");

    }
}
