import java.util.*;
class Stacks{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int value,element,max=0;
        Stack<Integer> s = new Stack<Integer>();
        for(int i=0;i<n;i++){
            value = scan.nextInt();
            if(value == 1){
                element = scan.nextInt();
                if(element > max)
                    max = element;
                s.push(element);
            }
            if(value == 2){
                s.pop();
                max = Collections.max(s);
            }
            if(value == 3)
                System.out.println(max);

        }

    }
}