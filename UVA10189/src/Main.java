import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #573
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
	void Begin() {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] output;
		int[] positions;
		int x, y;

		while (scan.hasNextLine()) {
			
			x = scan.nextInt();
			y = scan.nextInt();
			scan.nextLine();
			
			positions = new int[x*y];
			output = new int[x][y];
			int counter = 0;

			
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					String line = scan.nextLine();
					if (line.substring(j, j+1).equals("*")) {
						positions[counter++] = i;
						positions[counter++] = j;
					}
				}
			}
			
			for (int i = 0; i < counter; i = i + 2) {
				if (positions[i] > 0 && positions[i] < x) {
					if (positions[i+1] > 0 && positions[i+1] < y) {
						output[positions[i]-1][positions[i-1]-1]++;
						output[positions[i]-1][positions[i-1]]++;
						output[positions[i]-1][positions[i-1]+1]++;
						output[positions[i]][positions[i-1]-1]++;
						output[positions[i]][positions[i-1]+1]++;
						output[positions[i]+1][positions[i-1]-1]++;
						output[positions[i]+1][positions[i-1]]++;
						output[positions[i]+1][positions[i-1]+1]++;
					}
				}
				else if (positions[i] == 0) {
					if (positions[i+1] == 0) {
						output[positions[i]][positions[i-1]+1]++;
						output[positions[i]+1][positions[i-1]]++;
						output[positions[i]+1][positions[i-1]+1]++;
					}
				}
			}
			
		}
	} }