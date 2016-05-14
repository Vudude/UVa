import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #406
 */
class Main {

    static String ReadLn (int maxLg)  // utility function to read from stdin
    {
        byte lin[] = new byte [maxLg];
        int lg = 0, car = -1;

        try
        {
            while (lg < maxLg)
            {
                car = System.in.read();
                if ((car < 0) || (car == '\n')) break;
                lin [lg++] += car;
            }
        }
        catch (IOException e)
        {
            return (null);
        }

        if ((car < 0) && (lg == 0)) return (null);  
        return (new String (lin, 0, lg));
    }	

	public static void main(String[] args) {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
	void Begin() {
		
		String s = ReadLn(255);
		while(s != null) {
			String[] num = s.trim().split(" ");
			int max = Integer.parseInt(num[0]);
			int center = Integer.parseInt(num[1]);
			

			boolean[] notPrime = new boolean[max + 1];
			for (int i = 2; i <= max; i++) { 
				if(notPrime[i] == false) {
					for (int j = i; i*j <= max; j++) {
						notPrime[i*j] = true;
					}
				}
			}
			
			int numPrime = 1;
			for (int i = 2; i <= max; i++) {
				if (notPrime[i] == false) {
					numPrime++;
				}
			}
			
			int[] primes = new int[numPrime];
			int index = 0;
			for (int i = 1; i < notPrime.length; i++) {
				if (notPrime[i] == false) {
					primes[index++] = i;
				}
			}

			if (center >= numPrime) center = numPrime;
			if (numPrime % 2 == 0) {
				center = center * 2;
			}
			else {
				center = center * 2 - 1;
			}
			
			System.out.print(max + " " + Integer.parseInt(num[1]) + ":");
			if (((numPrime-1)/2)-((center-1)/2) < 0) {
				for (int i =0; i < numPrime ; i++) {
					System.out.print(" " + primes[i]);
				}
			}
			else {
				for (int i = 0; i < center; i++){
					System.out.print(" " + primes[((numPrime-1)/2)-((center-1)/2) + i]);
				}
			}
			System.out.println();
			System.out.println();
			s = ReadLn(255);
		}

	}

}
