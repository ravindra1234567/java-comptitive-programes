import java.util.*;
public class ReatestElementonRightSide {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();

        int max = arr[n-1];
        arr[n-1] = -1;
        for(int i = n-2;i>=0;i--){
            int temp = arr[i];
            arr[i] = max;
            if(max < temp)
                max = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}