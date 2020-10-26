import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
     String str;
     int flag = 0;
     TreeMap<Integer , String > ty = new TreeMap<Integer , String>();
     TreeMap<Integer , String > sy = new TreeMap<Integer , String>();
     while(scan.hasNext()){
       str = scan.next();
       String s = str.substring(0,2);
       if(s.equals("SY"))
            sy.put(Integer.parseInt(str.substring(2)),str);
        else if(s.equals("TY")){
            ty.put(Integer.parseInt(str.substring(2)),str);
        }else{
            flag = 1;
            break;
        }
     }
     if(flag == 0){
     Integer min = Math.min(ty.firstKey(),sy.firstKey());
     Integer max = Math.max(ty.lastKey(),sy.lastKey());
     for(Integer i=min;i<=max;i++){
         if(ty.containsKey(i) && sy.containsKey(i)){
             System.out.println("["+ty.get(i)+"]["+sy.get(i)+"]");
         }else if(ty.containsKey(i) && !sy.containsKey(i)){
             System.out.println("["+ty.get(i)+"]["+"ABSENT"+"]");
         }else if(!ty.containsKey(i) && sy.containsKey(i)){
             System.out.println("["+"ABSENT"+"]["+sy.get(i)+"]");
         }
     }
     }else{
         System.out.println("Invalid Input");
     }
    }
}
