import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #10921
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
		void Begin() {
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String s = scan.nextLine();

			s = s.toUpperCase().replace("A", "2");
			s = s.toUpperCase().replace("B", "2");
			s = s.toUpperCase().replace("C", "2");
			s = s.toUpperCase().replace("D", "3");
			s = s.toUpperCase().replace("E", "3");
			s = s.toUpperCase().replace("F", "3");
			s = s.toUpperCase().replace("G", "4");
			s = s.toUpperCase().replace("H", "4");
			s = s.toUpperCase().replace("I", "4");
			s = s.toUpperCase().replace("J", "5");
			s = s.toUpperCase().replace("K", "5");
			s = s.toUpperCase().replace("L", "5");
			s = s.toUpperCase().replace("M", "6");
			s = s.toUpperCase().replace("N", "6");
			s = s.toUpperCase().replace("O", "6");
			s = s.toUpperCase().replace("P", "7");
			s = s.toUpperCase().replace("Q", "7");
			s = s.toUpperCase().replace("R", "7");
			s = s.toUpperCase().replace("S", "7");
			s = s.toUpperCase().replace("T", "8");
			s = s.toUpperCase().replace("U", "8");
			s = s.toUpperCase().replace("V", "8");
			s = s.toUpperCase().replace("W", "9");
			s = s.toUpperCase().replace("X", "9");
			s = s.toUpperCase().replace("Y", "9");
			s = s.toUpperCase().replace("Z", "9");

			System.out.println(s);


		}
	}
}