import java.util.*;
class PranthesisCount{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int length = str.length();
        int count = 0;
        for(int i=0;i<length;i++){
            if(str.charAt(i) == '(' && (i+1 < length) && str.charAt(i+1) == ')' ){
                        i++;
                        continue;
            }
            else
                count++;
                
        }
        System.out.println(count);
    }
}