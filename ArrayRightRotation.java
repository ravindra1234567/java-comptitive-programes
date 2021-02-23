import java.io.*;
import java.util.*;
class ArrayRightRotation{
	public static void main (String[] args) {
	    int arr[] = new int[]{1,2,3,4,5,6};//[3, 4, 1, 2, 3, 4, 5]
	    int d=3;
	    int length = arr.length;
	    int a[] = new int[length];
	   // System.arraycopy(arr,0,a,d,length-d);
	   // System.arraycopy(arr,length-d,a,0,d);
	   for(int i=0;i<length;i++){
	       if(d-i>0)
	            a[i] = arr[(length+i)-d];
	       else
	            a[i] = arr[i-d];
	   }
	    String s = Arrays.toString(a);
		    System.out.println(s);
	}
}