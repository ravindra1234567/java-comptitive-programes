
import java.util.*;
import java.lang.*;
import java.io.*;

class MaximumSumIncreasingSubsequence{
    
    static int maximumSum(Integer arr[],int n){
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(arr));
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && a.get(i) < (a.get(j)+arr[i]) )
                    a.set(i,a.get(j)+arr[i]);
            }
        }
        return Collections.max(a);
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,t;
		t = scan.nextInt();
		while(t-- > 0){
		 n = scan.nextInt();
		 Integer arr[] = new Integer[n];
		 for(int i=0;i<n;i++)  
		    arr[i] = scan.nextInt();
		   System.out.println( maximumSum(arr,n)  );
		}
	}
}