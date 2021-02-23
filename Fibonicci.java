import java.util.*;
public class Fibonicci{
   static int[] fibonicci(int n){
       int[] arr = new int[n+1];
       if(n == 0){
            arr[0] = 0;
            return arr;
        }else{
            int n1=0,n2=1,n3;
            arr[0] = 0;
            arr[1] = 1;
            for(int i=2;i<=n;i++){
                n3 = n1+n2;
                arr[i] = n3;
                n1 = n2;
                n2=n3;
            }
        }
        return arr;
   }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[] a = fibonicci(n);
        System.out.println(Arrays.toString(a));
        
                
    }
}