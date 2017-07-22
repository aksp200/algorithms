/**
 * 
 */
package org.aks.util;

import java.util.Scanner;

/**
 * @author akshay
 *
 */
public class IOUtil {
	
	public static String readLine(Scanner scanner,String message){
		String nextLine = null;
		System.out.println(message);
		nextLine = scanner.nextLine();
		return nextLine;
	}
}
