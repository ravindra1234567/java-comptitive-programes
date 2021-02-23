import java.util.*;
import java.math.*;
public class MathematicOperation {

    static int fastPower(int num , int pow){
        int result =1;
        while( pow > 0){
            if((pow&1)!=0)
                result = result*num;
            num =num*num;
            pow = pow>>1;
        }
        return result;
    }
    static long fastPowerModulo(long num , long pow , int mod){
        long result =1;
        while(pow > 0){
            if( (num&1) != 0)
                result = (result * pow%mod)%mod;
            num = (num%mod * num%mod)%mod;
            pow = pow >> 1;
        }

        return result;
    }

    static int  calculateApowerBRecursion(int num , int pow){
        if(pow == 0)
            return 1;
        return num*calculateApowerBRecursion(num,pow-1);
    }


    static long calculateSumOfNnaturalNumberUsingRecursion(int num){
        if(num == 1)
            return 1;
        return num + calculateSumOfNnaturalNumberUsingRecursion(num-1);
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println(fastPower(2, 4));
        System.out.println(fastPowerModulo(3652,25,100000007));
        System.out.println(calculateApowerBRecursion(2,5));
    }
    
}
