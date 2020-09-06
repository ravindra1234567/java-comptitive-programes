import java.util.*;
class FindTriplets{
    static void triplet(int[] arr ,int n,int sum){
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++){
            int j=i+1;
            int k = n-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k] == sum){
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    count++;
                    j++;
                }
                else if(arr[i]+arr[j]+arr[k] > sum)
                    k--;
                else
                    j++;
            }
        }
        System.out.println("Total triplets = "+count);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,sum;
        n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] =  scan.nextInt();
        sum = scan.nextInt();
        triplet(arr,n,sum);
        scan.close();
    }
}