import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #11172
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
		void Begin() {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.nextLine();
		long one, two;

		while (scan.hasNextLine()) {

			one = scan.nextLong();
			two = scan.nextLong();
			scan.nextLine();

			if (one > two) System.out.println(">");
			else if (two > one) System.out.println("<");
			else System.out.println("=");
		}
	}
}