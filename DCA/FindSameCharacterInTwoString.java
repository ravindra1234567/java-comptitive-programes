import java.util.*;
public class FindSameCharacterInTwoString {



    public static void main(String[] args){
        String str1 = "abc  f";
        String str2 = "cksdjfag";

        TreeSet<Character> ts = new TreeSet<>();

        char[] arr = str1.toCharArray();

        for(char c : arr){
            if(c==' ')
                continue;
            if(str2.contains(String.valueOf(c)))
                ts.add(c);
        }
        System.out.println(ts);
        List<Character> rv = new ArrayList<>(ts);

        Collections.sort(rv,Comparator.reverseOrder());
        System.out.println(rv);



    }
}
