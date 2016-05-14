import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #11559
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
	void Begin() {
		
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextLine()) {
			int people = scan.nextInt();
			int budget = scan.nextInt();
			int hotels = scan.nextInt();
			int weekends = scan.nextInt();
			scan.nextLine();
			
			int[][] hotelWeekend = new int[hotels][weekends + 1];

			int minCost = 999999999;


			for (int i = 0; i < hotels; i++) {
				hotelWeekend[i][0] = scan.nextInt();
				scan.nextLine();
				for (int j = 1; j < weekends + 1; j++) {
					hotelWeekend[i][j] = scan.nextInt();
				}
				scan.nextLine();
			}
			
			for (int i = 0; i < hotels; i++) {
				for (int j = 1; j < weekends + 1; j++) {
					if (people <= hotelWeekend[i][j]) {
						if (hotelWeekend[i][0] * people <= budget && hotelWeekend[i][0] * people < minCost) minCost = hotelWeekend[i][0] * people;
					}
				}
			}
			
			if (minCost == 999999999)
				System.out.println("stay home");
			else
				System.out.println(minCost);
		}
	}
}