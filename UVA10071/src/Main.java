import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #10071
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
		void Begin() {
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {

			int one = scan.nextInt();
			int two = scan.nextInt();


		    System.out.println(one * two * 2);

		}
	}
}