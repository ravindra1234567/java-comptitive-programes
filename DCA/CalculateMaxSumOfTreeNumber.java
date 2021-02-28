
import java.util.*;
import java.math.*;

public class CalculateMaxSumOfTreeNumber {
    static int calculateMax(int[] arr) {
        int max = 0;
        int len = arr.length;
        if (len < 4)
            return 0;
        for (int i = 0; i < len-1; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                int sum = 0;
                sum += arr[i] + arr[j] + arr[j + 1];
               max = Math.max(sum, max);
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int[] arr = { 1,2,3,4,5 };
        System.out.println(calculateMax(arr));
    }
}
