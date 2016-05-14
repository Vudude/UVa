import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #100
 */
class Main {

//    static String ReadLn (int maxLg)  // utility function to read from stdin
//    {
//        byte lin[] = new byte [maxLg];
//        int lg = 0, car = -1;
//
//        try
//        {
//            while (lg < maxLg)
//            {
//                car = System.in.read();
//                if ((car < 0) || (car == '\n')) break;
//                lin [lg++] += car;
//            }
//        }
//        catch (IOException e)
//        {
//            return (null);
//        }
//
//        if ((car < 0) && (lg == 0)) return (null);  
//        return (new String (lin, 0, lg));
//    }	

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
	static int findCycle(int num) {
		int cycles = 1;
		while (num != 1) {
			if (num % 2 == 1) num = 3*num + 1;
			else num = num/2;
			cycles++;
		}
		return cycles;
	}
	
	void Begin() {
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextInt()) {

			int one = scan.nextInt();
			int two = scan.nextInt();
			int maxCycle = -1;
			int cycle;

		
			if (one < two) {
				for (int i = one; i <= two; i++) {
					cycle = findCycle(i);
					if (cycle > maxCycle) maxCycle = cycle;
				}
			}
			else {
				for (int i = two; i <= one; i++) {
					cycle = findCycle(i);
					if (cycle > maxCycle) maxCycle = cycle;
				}
			}
			System.out.println(one + " " + two + " " + maxCycle);

		}
	}
}