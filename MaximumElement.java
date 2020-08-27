import java.io.*;
import java.util.*;

public class MaximumElement{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        Stack<Long> st = new Stack<Long>();
        int n,value;
        long max=0,element;
        n = scan.nextInt();
        while(n-- > 0){
                value = scan.nextInt();
            if(value == 1){
                element = scan.nextLong();
                if(st.empty())
                    max = element;
                else
                    if(max < element)
                        max = element;
                st.push(element);
            }
            else if(value==2){
                st.pop();
                if(!st.empty())
                    max = Collections.max(st);
            }else 
                System.out.println(max);
        }
    }
}
