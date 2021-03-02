import java.util.*;
public class StackRevercePrint {
    static void  reverseprint(Stack<Integer> st){

            if(st.size()== 0)
                return;
            int x = st.peek();
            st.pop();
            reverseprint(st);
            System.out.print(x + " ");
            st.push(x);
    }
    public static void main(String[] args){

        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);
        int n = st.size();;
        // for(int i =0; i <n; i++){
        //     System.out.print(st.peek()+" ");
        //     st.pop();
        // }

        int k = st.size();

        reverseprint(st);

        // for(int i =0; i <n; i++){
        //         System.out.print(st.peek()+" ");
        //         st.pop();
        //     }
        

    }
}
