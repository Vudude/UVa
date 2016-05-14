import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #12798
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
		void Begin() {
		
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextLine()) {
			int players = scan.nextInt();
			int matches = scan.nextInt();
			scan.nextLine();
		
			int count = players;
			boolean noCount = false;
			
			for (int i = 0; i < players; i++) {
				for (int j = 0; j < matches; j++) {
					int num = scan.nextInt();
					if (num == 0) noCount = true;
				}
				if (noCount) {
					count--;
					noCount = false;
				}
			}
			scan.nextLine();
			System.out.println(count);
		}
	}
}