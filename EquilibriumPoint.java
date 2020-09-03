import java.util.*;
import java.lang.*;
import java.io.*;

class EquilibriumPoint{
    static int printposition(ArrayList<Integer> arr,int sum){
         int leftsum=0;
        for(int i=0;i<arr.size();i++){
            sum = sum-arr.get(i);
            if(sum == leftsum)
                    return i+1;
            leftsum+=arr.get(i);
        }
            return -1;
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,t,sum;
		t = scan.nextInt();
		while(t-- > 0){
		    n = scan.nextInt();
		    sum=0;
		    ArrayList<Integer>arr = new ArrayList<Integer>();
		    for(int i=0;i<n;i++){
		        int value = scan.nextInt();
		        arr.add(value);
		        sum =sum+value;
		    }
		
		    System.out.println(printposition(arr,sum));
		}
	}
}