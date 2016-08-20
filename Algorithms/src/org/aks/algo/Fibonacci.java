/**
 * 
 */
package org.aks.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author akshay
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		
		int limit = 7;
		System.out.println(fibonacci.fibonacci(limit));
	}
	
	
	public String readLine(Scanner scanner,String message){
		String nextLine = null;
		System.out.println(message);
		nextLine = scanner.nextLine();
		return nextLine;
	}
	
	
	public List<Integer> fibonacci(int limit){
		List<Integer> fibonacci = new ArrayList<>();
		int prev =0 ;
		int current=0;
		int next=1;
		
		while(limit-->0){
			fibonacci.add(current);
			prev=current;
			current=next;
			next = prev+current;
		}
		return fibonacci;
	}

}
