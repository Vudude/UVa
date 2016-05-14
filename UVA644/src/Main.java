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
		
		String[] codes = new String[10];
		int index = 0;
		String read;
		int set = 1;
		boolean notDecode = true;
		while (scan.hasNextLine()) {
			notDecode = true;
			read = scan.nextLine();
			if (read.equals("9")) {
				for (int i = 0; i < index; i++) {
					for (int j = 0; j < index; j++) {
						if (codes[i].length() <= codes[j].length() && (i != j)) {
							if (codes[i].equals(codes[j].substring(0, codes[i].length()))){
								System.out.printf("Set %d is not immediately decodable\n", set++);
								notDecode = false;
								break;
							}
						}
					}
					if (!notDecode) break;
				}
				index = 0;
				if (notDecode) {
					System.out.printf("Set %d is immediately decodable\n", set++);
				}
			}
			else {
				codes[index++] = read;
			}
		}
	}
}