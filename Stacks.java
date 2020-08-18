import java.util.*;
class Stacks{
    public static void popElement(Stack st){
        System.out.print(st.pop()+" ");
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack s = new Stack();
        for(int i=0;i<n;i++)
            s.push(scan.nextInt());
        
        for(int i=0;i<n;i++){
            // int a = (int)s.pop();
            // System.out.print(a.getClass().getName()+" ");
            System.out.print(s.peek()+"  ");
        }
        System.out.println("\nsearch = " + s.search(3));

    }
}