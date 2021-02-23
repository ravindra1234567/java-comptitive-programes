import java.util.*;
class User implements Compara{
    public int compare(Object obj1,Object obj2){
        Integer i1 = (Integer)obj1;
        Integer i2 = (Integer)obj2;
        return -i1.compareTo(i2);

    }
} 
public class CompareToMethod{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n = scan.nextInt();
        while(n-- > 0)
            arr.add(scan.nextInt());
        Collections.sort(arr,new User());
        System.out.println(arr);
    }
}