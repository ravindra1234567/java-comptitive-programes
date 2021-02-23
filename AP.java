import java.util.*;
class Ap{
    static int ap(int[] arr , int l,int r,int d){
        int mid;
        mid = (l+r)/2;
        if( arr[mid] == (arr[0]+l*d) )
            return ap(arr,mid+1,r,d);
        else 
            return ap(arr,0,mid,d);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int l,r,d,d1,d2;
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();
        l = 0;
        r = n-1;
        d1 = Math.min( (arr[1] -arr[0]) , arr[2]-arr[1]);
        d = Math.min( (arr[n-1]-arr[n-2]) , d1);
        System.out.println(d);
        
    }
}