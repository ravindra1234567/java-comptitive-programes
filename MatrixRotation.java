import java.util.*;
public class MatrixRotation {
    static void leftRotation(int arr[][],int r){
        int length = arr.length;
        int a[][] = new int[length][length];
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++)
                a[i][j] = arr[j][length-1-i];
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++)
                System.out.print(a[i][j]+" ");
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                arr[i][j] = scan.nextInt();
        }
        int shift = scan.nextInt();
        leftRotation(arr, shift);
    }
}