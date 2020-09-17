import java.util.*;
public class PrintSeries {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a=0,b=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                if(i>1)
                    a = a+2;
                System.out.print(a+" ");
            }else{
            
                b = a/2;
                System.out.print(b+" ");
            }
        }
    }
}

