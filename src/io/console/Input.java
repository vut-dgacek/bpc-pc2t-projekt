package io.console;
import java.util.Scanner;

public class Input {
	public static int readInt(Scanner sc) {
		int num = 0;

		try {
			num = sc.nextInt();
		} catch(Exception e) {
			System.out.println("Input is NOT an integer! " + e.toString());
			sc.nextLine();
			num = readInt(sc);
		}

		return num;
	}
	
	public static boolean readBool(Scanner sc) {
		int num = readInt(sc);
		boolean bool = true;
		
		try {
			if (num == 0) { 
				bool = true; 
			} else { 
	        	bool = false; 
	        }
		} catch (Exception e) {
			System.out.println(e.toString());
			sc.nextLine();
			num = readInt(sc);
		}
		return bool;
	}
}
