import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #10055
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
		void Begin() {
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLong()) {

			long one = scan.nextLong();
			long two = scan.nextLong();


			if (two >= one) System.out.println(two - one);
			else System.out.println(one - two);

		}
	}
}