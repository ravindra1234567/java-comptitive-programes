import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Candies{
    public static void main(String args[] ) throws Exception {

        Scanner scan = new Scanner(System.in);
        int t;
        t = scan.nextInt();
        
        while(t-- > 0){
            int sum=0,n;
            n = scan.nextInt();
            ArrayList<Integer>arr = new ArrayList<Integer>();
            ArrayList<Integer> al = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                int value = scan.nextInt();
                arr.add(value);
                sum = sum+value;
            }  
            al.addAll(arr);
            for(int j=0;j<=arr.size();j++){
                if(j+1<arr.size())
                    al.add(arr.get(j)+ arr.get(j+1) );
            }
            if(n<Collections.max(al) && Collections.max(al)<sum)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}