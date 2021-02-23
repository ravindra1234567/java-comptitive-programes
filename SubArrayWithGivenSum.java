import java.lang.*;
import java.io.*;
import java.util.*;

class SubArrayWithGivenSum{
static void continuousSubArray(int arr[],int sum){
        int j=0,s=0;
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];
            while(s>sum)
                s=s-arr[j++];
            if(s==sum){
                System.out.println((j+1)+" "+(i+1));
                break;
            }
        }
        if(sum!=s)
            System.out.println(-1);
    }
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0){
		int n = scan.nextInt();
		int sum = scan.nextInt();
		int aa[] = new int[n];
		   for(int i=0;i<n;i++)
		      aa[i] = scan.nextInt();
		continuousSubArray(aa,sum);
		}
	}
}