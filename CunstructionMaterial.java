import java.util.*;
public class CunstructionMaterial {
   public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       int n,m1,m2,m3,sum,min;
       StringBuffer sb = new StringBuffer();
       n = scan.nextInt();
       m1 = scan.nextInt();
       m2 = scan.nextInt();
       m3 = scan.nextInt();
       min= Math.min(m3,Math.min(m1,m2));
       sum = min;
       sb.append(sum).append(" ");
       for(int i=0;i<n-1;i++){
           int mm1,mm2,mm3;
           int arr[] = new int[3];
           mm1 = scan.nextInt();
           mm2 = scan.nextInt();
           mm3 = scan.nextInt();
            arr[0] = mm1;
            arr[1] = mm2;
            arr[2] = mm3;
            // Arrays.sort(arr);
           if(min==arr[0]){
            sb.append(arr[1]).append(" ");
                sum=sum+arr[1];
                min = arr[1];
            }
            else{
                sb.append(arr[0]).append(" ");
                sum=sum+arr[0];
                min = mm1;
            }
       }
       System.out.println(sum + " " + sb);
   } 
}