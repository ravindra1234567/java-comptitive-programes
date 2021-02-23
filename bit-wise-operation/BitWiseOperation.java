public class BitWiseOperation{

    static int addition(int a,int b){
            int carry;
            while(b!=0){
                carry = a&b;
                a = a^b;
                b = carry<<1;
            }
        return a;
    }

    static int subtraction(int a , int b){
            int borrow;
            while(b!=0){
                borrow = (~a)&b;
                a = a^b;
                b = borrow<<1;
            }
        return a;
    }
    static int getIthBit(int a, int b){
         
        return  a&(1 << b) ;
    }


    static int  setIthBit(int num , int pos ){

        return num | (1<< pos);
    }

    static int clearIthBit(int num,int pos){
        int mask = ~(1 << pos);

        return  num & mask ;
    }
    static int findChangeBitConvertAToB(int num1,int num2){

        int findchangeBit = num1 ^ num2; // find numbers of change bits

        // count number of  set bits
        int count=0;
        while(findchangeBit!=0){
            count++;
            findchangeBit = findchangeBit & (findchangeBit-1);
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println("add = " + addition(100,2));
        System.out.println("sub = " + subtraction(5,2));
        System.out.println("Get Ith bit = "+ getIthBit(309,2));
        System.out.println("Get Ith bit = "+ setIthBit(309,3));
        System.out.println("Clear Ith bit = "+clearIthBit(309,4));
        System.out.println("Change A to B = "+findChangeBitConvertAToB(22,27));
    }

}