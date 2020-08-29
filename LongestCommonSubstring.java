import java.util.*;
public class LongestCommonSubstring{
    public static int LCSubStrA3(char[] X, char[] Y, int m, int n) {
		int memo[][] = new int[m + 1][n + 1];
		int result = 0;

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					memo[i][j] = 0;
				} else if (X[i - 1] == Y[j - 1]) {
					memo[i][j] = memo[i - 1][j - 1] + 1;
					result = Math.max(result, memo[i][j]);
				} else {
					memo[i][j] = 0;
				}
			}
		}
		return result;
	}
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n,sz1,sz2;
        String str1,str2;
        n = scan.nextInt();
        while(n-- > 0){
            int max=0,count=0;
            sz1 = scan.nextInt();
            sz2 = scan.nextInt();
            str1 = scan.next();
            str2 = scan.next();
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();
            System.out.println( LCSubStrA3(s1,s2,sz1,sz2));
        }
    }
    
}