import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
    int n,sum=0,count=0,flag=0;;
    while(scan.hasNext()){
        if(count++ < 20){
            try{
                n = scan.nextInt();
            if(n > 0 && n < 17)
                sum=sum+200;
            else if(17<= n && n <40)
                sum = sum+400;
            else if(40<=n && n<=120)
                sum = sum+300;
            else{
                flag = 1;
                break;
            }
            }catch(Exception e){
                System.out.println("Invalid INPUT");
                flag =1;
                break;
            }
        }else{
            flag = 1;
            break;
        }
    }
    if(flag == 0)
        System.out.println("Total Income "+sum+" INR");
    else
        System.out.println("Invalid INPUT");
    }
}
