import java.util.*;
public class MinimumSwaps {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n,swap=0,min;
        n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();
        for(int i=0;i<n; i++){
            if(i+1<n)
                if(arr[i]==arr[i+1])
                    continue;
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            // swap(arr[i],arr[arr[i]-1]);
            swap++;
        }
    System.out.println(swap);
}
}