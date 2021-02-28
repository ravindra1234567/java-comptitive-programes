// package DCA;
import java.util.*;
import java.util.regex.*;
public class RemoveElementINString {

    static String removeCharacter(String str){

        Pattern pattern = Pattern.compile("[^a-zA-Z)-9]");
        boolean match = pattern.matcher(str).find();
        if(match)
            return "String Invalid";
        String x = str.replaceAll("8","");
        String y = x.replaceAll("53","");
        return y;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(removeCharacter(str));
    }
}
