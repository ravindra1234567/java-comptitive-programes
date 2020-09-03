
import java.util.*;
import java.lang.*;
import java.io.*;

class MaximizeCutSegments{
    
    static int maximumCutting(int n,int x,int y,int z){
        Integer[] arr = new Integer[n+1];
        for(int i=0;i<=n;i++)
            arr[i] = -1;
            arr[0] = 0;
        for(int i=0;i<=n;i++){
            if(arr[i]!=-1){
                if(i+x <= n)
                    arr[i+x] = Math.max(arr[i+x],arr[i]+1);
                if(i+y <= n)
                    arr[i+y] = Math.max(arr[i+y],arr[i]+1);
                if(i+z <= n)
                    arr[i+z] = Math.max(arr[i+z],arr[i]+1);
            }
        }
        
        return arr[n];
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,t,x,y,z;
		t = scan.nextInt();
		while(t-- > 0){
		 n = scan.nextInt();
		 x = scan.nextInt();
		 y = scan.nextInt();
		 z = scan.nextInt();
		   System.out.println( maximumCutting(n,x,y,z)  );
		}
	}
}