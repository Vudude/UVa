import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #488
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
	void Begin() {
		
		Scanner scan = new Scanner(System.in);
		String[] amplitudes = {"1", "22", "333", "4444", "55555", "666666", "7777777", "88888888",
        "999999999"};
 		
			
			int cases = scan.nextInt();
			scan.nextLine();
			String output;
			
			for (int l = 0; l < cases; l++) {
				output = "";
				scan.nextLine();
				int amp = scan.nextInt();
				scan.nextLine();
	
				int freq = scan.nextInt();
				scan.nextLine();

				for (int j = 0; j < amp; j++) {
					output += amplitudes[j] + "\n";
				}
				for (int j = amp-2; j >= 0; j--) {
					output += amplitudes[j] + "\n";
				}
				
				for (int j = 0; j < freq; j++) {
					System.out.print(output);
					if (j != freq-1) {
						System.out.println();
					}
				}
				if (l != cases-1) 
					System.out.println();
			}
	}
}