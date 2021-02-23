import java.util.*;
public class SwapWithoutThirdVariable {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a,b;
        a = scan.nextInt();
        b = scan.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+a +" "+"b = "+ b);
    }
}