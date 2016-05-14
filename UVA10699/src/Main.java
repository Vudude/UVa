
import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #10699
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
	
	boolean check(int[] array, int search) {
		boolean out = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0 && search % array[i] == 0) out = false;
		}
		return out;
	}
	
	void Begin() {
		
		String s = ReadLn(255);
		while(s != null) {
			int num = Integer.parseInt(s.trim());
			
			int primes[] = new int[1000];
			int index = 0;

			for (int i = 2; i <= num; i++) {
				if (num % i == 0 && check(primes, i)) {
					primes[index++] = i;
				}
			}

			System.out.println(num + " : " + index);
			s = ReadLn(255);
			if (s.trim().equals("0")) break;
		}
	}
}
