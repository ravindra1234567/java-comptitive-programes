import java.util.*;
class uniquePairsSum{
    public static int uniquePairs(int[] nums, int target){
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> seen = new HashSet<Integer>();
        int count = 0;
        for(int num : nums){
            if(set.contains(target-num) && !seen.contains(num)){
                count++;
                seen.add(target-num);
                seen.add(num);
            }
            else if(!set.contains(num)){
                set.add(num);
            }

        }
        return count;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n,target;
        n= scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        target = scan.nextInt();
        System.out.println(uniquePairs(arr,target));
    }
    
}