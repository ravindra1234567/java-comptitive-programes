import java.util.*;
public class MatrixRotion {
    static void leftRotation(int arr[][],int r){
        int length = arr.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(j-r < 0){
                    arr[i][j] = arr[i][r-j];
                }else{
                    arr[j][i] = arr[i][j-r];
                }
            }
        }

        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println(" ");
        }

    }
    static void rightRotation(int arr[][],int r){

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