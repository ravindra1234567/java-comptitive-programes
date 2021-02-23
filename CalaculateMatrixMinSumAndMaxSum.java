import java.util.*;
public class CalaculateMatrixMinSumAndMaxSum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                arr[i][j] = scan.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE,p=0;
       
        for(int i=0;i<n;i++){
             int row=0,col=0;
            for(int j=0;j<n;j++){
                row+=arr[i][j];
                col+=arr[j][i];
            }
            min = Math.min( min, (Math.min(row,col) ) );
            max = Math.max( max, (Math.max(row,col) ) );
            System.out.println("row "+i+" = "+ row +"  "+"col "+(p++)+" = "+col);
        }
        System.out.println("\nmin = "+ min +"  "+"max = "+max);
    }
}