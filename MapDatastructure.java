import java.util.*;
import java.util.Map.Entry;
public class MapDatastructure {
    public static void main(String args[]){
        //Scanner scan = new Scanner(System.in);
        Map<String ,Integer> map = new TreeMap<String ,Integer>();
            map.put("z",20);
            map.put("s",30);
            map.put("r",60);
            map.put("a",50);
            map.putIfAbsent("p",100);
         System.out.println("key set = " + map.keySet());
         System.out.println("Values = "+map.values());
         System.out.println("Entry set = " + map.entrySet());
         Set<Entry<String ,Integer>> entry = map.entrySet();
         for(Entry<String, Integer> e : entry)
            System.out.println(e.getKey()+" =  "+e.getValue()+" ");
    }
}
// ilp.support@tcs.com
//  and put me in cc..
//  dharmender.k2@tcs.com
