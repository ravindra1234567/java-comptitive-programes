import java.util.*;
 class Queues{
   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n;
        n = scan.nextInt();
        while(n-- > 0)
            q.add(scan.nextInt());
        System.out.print(q);
        while(q.size() >0){
            System.out.print(q.remove()+" ");
        }
        System.out.println(q);
    }

}