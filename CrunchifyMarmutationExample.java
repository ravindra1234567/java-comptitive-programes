/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class CrunchifyMarmutationExample {
 
	public static Set<String> crunchifyPermutation(String str) {
		Set<String> crunchifyResult = new TreeSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			crunchifyResult.add("");
			return crunchifyResult;
		}
 
		char firstChar = str.charAt(0);
		String rem = str.substring(1);
        System.out.println(" rem "+ rem);
		Set<String> words = crunchifyPermutation(rem);
        System.out.println(" words "+ words);
		for (String newString : words) {
			for (int i = 0; i <= newString.length(); i++) {
				crunchifyResult.add(crunchifyCharAdd(newString, firstChar, i));
			}
		}
		return crunchifyResult;
	}
 
	public static String crunchifyCharAdd(String str, char c, int j) {
		String first = str.substring(0, j);
		String last = str.substring(j);
		return first + c + last;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t;
		t = scan.nextInt();
		while(t-- > 0){
            
		    String s = scan.next();
		    Set<String>str  = crunchifyPermutation(s);
		    for(String ss : str) 
		        System.out.print(ss+" ");
		  	System.out.println(" ");
		}
	
	}
 
}