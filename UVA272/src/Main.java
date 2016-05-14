import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #272
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
		void Begin() {
		
		Scanner scan = new Scanner(System.in);
		
		boolean open = true;

		while (scan.hasNextLine()) {
			String s = scan.nextLine();

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '"') {
					if (open) {
						s = s.substring(0, i) + "``" + s.substring(i + 1, s.length());
						open = false;
					}
					else {
						s = s.substring(0, i) + "''" + s.substring(i + 1, s.length());
						open = true;
					}
				}
			}
			System.out.println(s);
		}
	}
}