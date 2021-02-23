import java.util.*;
public class StringPalindrome {
    static int countPalindrome(String str,int n){
        int count = 0;
        String str1[] = str.split(" ");
        for(int i=0;i<str1.length;i++){
            String s1 = str1[i];
            int c=0;
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)==s1.charAt((s1.length()-1)-j))
                    c++;
            }
            if(c==s1.length())
                count++;
        }
        return count; 
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = scan.nextInt();
        System.out.println(countPalindrome(str, n));
    }
}