import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #11799
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
	void Begin() {
		
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextLine()) {
			int cases = scan.nextInt();
			scan.nextLine();

			int max = -1;
			String[] nums;
			
			for (int i = 0; i < cases; i++) {
				nums = scan.nextLine().split(" ");
				for (int j = 0; j < nums.length; j++) {
					if (Integer.parseInt(nums[j]) > max) max = Integer.parseInt(nums[j]);
				}
				System.out.println("Case " + (i + 1) + ": " + max);
				max = -1;
			}
		}
	}
}