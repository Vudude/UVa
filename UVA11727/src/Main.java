import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #11727
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
			
			int[] num = new int[3];
			int currentCase = 1;

			for (int i = 0; i < cases; i++) {
				num[0] = scan.nextInt();
				num[1] = scan.nextInt();
				num[2] = scan.nextInt();
				scan.nextLine();
				int max = 0, min = 0;

				for (int j = 1; j < 3; j++) {
					if (num[j] > num[max]) max = j;
					if (num[j] < num[min]) min = j;
				}
				num[max] = -1;
				num[min] = -1;
				int safe = 0;
				for (int j = 0; j < 3; j++) {
					if (num[j] != -1) safe = j;
				}
				System.out.println("Case " + currentCase++ + ": " + num[safe]);
			}
			
		}
	}
}