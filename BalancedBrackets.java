import java.util.*;
public class BalancedBrackets{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str;
        int length;
        char c;
        Stack<Character> st = new Stack<Character>();
        while(n-- > 0){
            st.clear();
            st.push('#');
            str = scan.next();
            length = str.length();
            for(int i=0;i<length;i++){
                c = str.charAt(i);
                if(c=='('||c=='{'||c=='['){
                        st.push(c);
                }
                else{
                    if( !st.empty()&& (c ==')') && st.peek()=='('){
                        st.pop();
                    }
                    else if(!st.empty() && (c=='}' && st.peek()=='{') ){
                        st.pop();  
                    }
                    else if(!st.empty() && (c==']' && st.peek() == '[' ) ){
                        st.pop();
                    }else
                        st.push(c);
                } 
            }
            if(st.peek() == '#')
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }    
}
