import java.util.*;

public class checkSumIncreasingOrder {

    static ArrayList<Integer> calculateSum(int[] arr){
        ArrayList<Integer> alist = new ArrayList<>();
        int len = arr.length;
        for(int i=0;i<len;i++){
            if( (len-1 > i) && (arr[i] > arr[i+1]))
                continue;
            else if(len-1 > i){
                int res=0;
                res=+ arr[i]+arr[i+1];
                System.out.println("res = "+ res);
                i++;
                for(int j=i+1;j<=len;j++){
                    if( (len >j) && (res<arr[j])){
                        res= res+arr[j];
                        i++;
                    }
                    else 
                        break;
                }
                alist.add(res);
            }
        }

        return alist;
    }

    public static void main(String ae[]){
        int arr[] = {15,10,-2,200,4,5};


        ArrayList<Integer> l = calculateSum(arr);
        System.out.print(l);
    }
    
}
