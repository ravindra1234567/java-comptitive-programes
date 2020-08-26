import java.util.*;
class Ancestral{
    String age;
    String name;
    public Ancestral(String name, String age){
        this.name = name;
        this.age = age;
        
    }
}
class Checker implements Comparator<Ancestral>{
    static int value(char c){
        if(c == 'I')
            return 1;
        else if(c == 'V')
            return 5;
        else if(c == 'X')
            return 10;
        else if(c == 'L')
            return 50;
        else if(c == 'C')
            return 100;
        else if(c == 'D')
            return 500;
        else if(c == 'M')
            return 1000;
        else
            return -1;
    }
    static Integer changeRoman(String str){
        int length;
        Integer result=0;
        length = str.length();
        for(int i=0;i<length;i++){
            int s1 = value(str.charAt(i));
            if(i+1<length){
                int s2 = value(str.charAt(i+1));
                if(s1>=s2)
                    result = result+s1;
                else{
                    result = result+s2-s1;
                    i++;
                }
            }else{
                result = result+s1;
                i++;
            }

        }
        return result;
    }

    public int compare(Ancestral a,Ancestral b){
        Integer i1 = changeRoman(a.age);
        Integer i2 = changeRoman(b.age);
        if((a.name).equals(b.name) )
            return i1.compareTo(i2);
        else
          return (a.name).compareTo(b.name);
         
    }

}
public class AncestralNames{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the array  size =  ");
        int n = scan.nextInt();
        Ancestral[] an = new Ancestral[n];
        Checker checker = new Checker();

        System.out.print("Enter Two  String  first name second age in Roman \n");
        for(int i = 0; i < n; i++){
            String str1 = scan.next();
            String str2 = scan.next();
            an[i] = new Ancestral(str1,str2);
        }
        Arrays.sort(an,checker);
        System.out.println("**************Output***********");
        for(int i=0;i<an.length;i++){
            System.out.println(an[i].name+" "+an[i].age);
        }
        
    }

    
}