import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayLeftRotation{
    // Complete the rotLeft function below.
        static void rotLeft(int[] a, int d) {
        int length = a.length;
        int[] b = new int[length];

        // System.arraycopy(a, d, b, 0, length - d);
        // System.arraycopy(a, 0, b, length - d, d);
        for(int i=0;i<length;i++){
            if(i-d<0)
                b[length+i-d] = a[i];
            else
                b[i-d] = a[i];
        }
        for(int i=0;i<length;i++)
            System.out.print(b[i]+" ");
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();
        int d = scan.nextInt();
            rotLeft(arr,d);
        scan.close();
    }
}
