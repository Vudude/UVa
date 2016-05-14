import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #11498
 */
class Main {

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
	void Begin() {
		
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNextLine()) {
			int queries = scan.nextInt();
			scan.nextLine();
			if (queries == 0)
				break;
			int divX, divY, x, y;
			divX = scan.nextInt();
			divY = scan.nextInt();
			scan.nextLine();
			for (int i = 0; i < queries; i++) {
				x = scan.nextInt();
				y = scan.nextInt();
				scan.nextLine();
				
				if (x == divX || y == divY)
					System.out.println("divisa");
				if (x > divX && y > divY)
					System.out.println("NE");
				if (x > divX && y < divY)
					System.out.println("SE");
				if (x < divX && y > divY)
					System.out.println("NO");
				if (x < divX && y < divY)
					System.out.println("SO");
			}
			
		}
	}
}