import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BettingSafest{
    private static float minGrowth(float arr[]){
        float minG=1000000,d=0,p;
        for(int i=0;i<arr.length;i++){
            if(i+1<arr.length)
                d = arr[i+1] - arr[i];
            
             p = (d*100)/arr[i];
            if(p<minG)
                minG = p;
        }
        return minG;
    }
    
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int t;
        t = scan.nextInt();
        
        while(t-- > 0){
             float minG1=0,minG2=0;
             String str1 = scan.next();
             float arr[] = new float[5];
            for(int i=0;i<5;i++)
                arr[i] = scan.nextFloat();
            minG1 = minGrowth(arr);
            String str2 = scan.next();
            for(int i=0;i<5;i++)
                arr[i] = scan.nextFloat();
            minG2 = minGrowth(arr);
            
            if(minG1 >= minG2)
                System.out.println(str1);
            else
                System.out.println(str2);
        }
    }
}