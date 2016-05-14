import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #1124
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
	void Begin() {
		
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
	}
}