import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #10018
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
	
	void Begin() {
		
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		scan.nextLine();

		String numString;
		int iter;
		long num;
		String rev;

		for (int i = 0; i < n; i++) {
			numString = scan.nextLine();
			iter = 0; 

			num = 0;
			rev = reverse(numString);
			num = Long.parseLong(numString) + Long.parseLong(rev);
			numString = Long.toString(num);
			iter++;
			
			while (!isPalindrome(numString)) {
				iter++;
				num = 0;
				rev = reverse(numString);
				num = Long.parseLong(numString) + Long.parseLong(rev);
				numString = Long.toString(num);
			}
			System.out.println(iter + " " + numString);
		}
	}

	boolean isPalindrome(String text) {
		if (text == null)
			return false;
		
		int left = 0;
		int right = text.length() - 1;
		
        while (left < right)
        	if (text.charAt(left++) != text.charAt(right--))
        		return false;
        return true;
	}
	
	String reverse(String str) {
		
		String ret = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			ret += str.charAt(i);
		}
		return ret;

	}

}