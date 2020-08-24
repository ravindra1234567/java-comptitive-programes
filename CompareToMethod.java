import java.util.*;
class User implements Comparable{
    int no;
    String name;
    public User(int no,String name){

    }
}
public class CompareToMethod{
    public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            ArrayList<Integer,String> arr = new ArrayList<Integer,String>();
            int n = scan.nextInt();
            while(n-- > 0){
                arr.add(scan.nextInt(),scan.next());
            }
            System.out.println(arr);
    }
}