import java.util.*;

public class DeleteMiddleElementFromStack {

    static void deleteMiddleElement(Stack<Integer> s , int k){
            if(k==1){
                s.pop();
                return;
            } 
            int temp = s.pop();
            deleteMiddleElement(s ,k-1);
            s.push(temp);

    }



    public static void main(String args[]){
        Stack<Integer>  arr = new Stack<>();
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        arr.push(5);
        int k = ((arr.size()-1)/2)+1;
        System.out.println("k = "+k);
        deleteMiddleElement(arr,k);
        System.out.println(arr);

    }
    
}
