import java.io.*;
import java.util.*;

/*
 * Author: Vu Le
 * #458
 */
class Main {

	public static void main(String[] args) throws IOException {
		
		Main myWork = new Main();
		myWork.Begin();
		
		
	}
	
		void Begin() throws IOException {
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		OutputStreamWriter out = new OutputStreamWriter(System.out,"ISO-8859-1");

		String s, output;

		while ((s = scan.readLine()) != null) {
			
			output = "";

			for (int i = 0; i < s.length(); i++) {
				output += (char)(s.charAt(i) - 7);
			}

			out.write(output + '\n');
			out.flush();

		}
	}
}