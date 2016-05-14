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
		
		while (scan.hasNextLine()) {
			int height = scan.nextInt();
			int climb = scan.nextInt();
			int fall = scan.nextInt();
			float fatigue = scan.nextInt();
			scan.nextLine();
			
			if (height == 0)
				break;

			float distance = 0;
			int days = 0;
			float climbAbility = climb;

			while (distance <= height && distance >= 0) {

				climbAbility = climb - (climb * fatigue/100 * days++);
				if (climbAbility < 0)
					climbAbility = 0;
				distance = distance + climbAbility;
				if (distance > height) break;
				else distance = distance - fall;
			}
			
			if (distance < 0)
				System.out.println("failure on day " + days);
			else
				System.out.println("success on day " + days);
		}
	} }