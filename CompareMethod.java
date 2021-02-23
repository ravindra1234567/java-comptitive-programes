import java.util.*;
class User implements Comparator{
   
    public int  compare(Object obj1,Object obj2){
            Integer i1 = (Integer)obj1;
            Integer i2 = (Integer)obj2;
            if(i1>i2)
                return -1;
            else if(i1<i2)
                return +1;
            else
                return 0;
    }
}
public class CompareMethod{
    public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            // TreeSet<Integer> ts = new TreeSet<Integer>( new User() );
            ArrayList arr = new ArrayList();
            int n = scan.nextInt();
            while(n-- > 0){
                arr.add(scan.nextInt());
            }
            Collections.sort(arr,new User());
            System.out.println(arr);
    }
}