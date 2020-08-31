import java.util.*;
public class CalaculateSimilarCharacterString {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char[] c = str.toCharArray();
        Arrays.sort(c);
        int count=1;
        // char cc;
        for(int i=0;i<c.length;i++){
                if(i+1 < c.length)
                    if(c[i] == c[i+1]){
                        count++;
                        continue;
                    }else{
                        System.out.print(c[i]+""+count);
                        count=1;
                    }
            
        }
    }
}