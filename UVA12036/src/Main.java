import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #12036
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
	void Begin() {
		
		Scanner scan = new Scanner(System.in);
		
		int[] integers;
		int n;
		boolean permutable;
		int cases = Integer.parseInt((scan.nextLine()));
		for (int i = 0; i < cases; i++) {

			integers = new int[100];
			n = Integer.parseInt((scan.nextLine()));
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					integers[scan.nextInt()]++;
				}
				scan.nextLine();
			}
			permutable = true;
			for (int j = 0; j < integers.length; j++){
				if (integers[j] > n) permutable = false;
			}
			if (permutable) System.out.printf("Case %d: yes\n", i + 1);
			else  System.out.printf("Case %d: no\n", i + 1);
		}
	}
}