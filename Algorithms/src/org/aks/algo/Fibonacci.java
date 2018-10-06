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
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		Scanner scanner = new Scanner(System.in);
		int limit = Integer.parseInt(fibonacci.readLine(scanner,"Enter limit for fibonacci : "));
		System.out.println(fibonacci.fibonacci(limit));
	}
	
	
	private String readLine(Scanner scanner,String message){
		String nextLine;
		System.out.println(message);
		nextLine = scanner.nextLine();
		return nextLine;
	}
	
	
	public List<Integer> fibonacci(int limit){
		List<Integer> fibonacci = new ArrayList<>();
		int prev;
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
