package org.aks.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author akshay
 */
public class Fibonacci {

    /**
     * @param args command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);
        int limit = Integer.parseInt(fibonacci.readLine(scanner, "Enter limit for fibonacci : "));
        System.out.println(fibonacci.fibonacci(limit));


        limit = Integer.parseInt(fibonacci.readLine(scanner, "Enter N for finding Nth fibonacci number : "));
        System.gc();
        System.out.println(System.currentTimeMillis());
        System.out.println(fibonacci.fibonacciRecursive(limit));
        System.out.println(System.currentTimeMillis());
        System.gc();
        limit = Integer.parseInt(fibonacci.readLine(scanner, "Enter N for finding Nth fibonacci number : "));
        System.out.println(System.currentTimeMillis());
        System.out.println(fibonacci.fibonacci(limit, new int[limit+1]));
        System.out.println(System.currentTimeMillis());

    }


    private String readLine(Scanner scanner, String message) {
        String nextLine;
        System.out.println(message);
        nextLine = scanner.nextLine();
        return nextLine;
    }


    public List<Integer> fibonacci(int limit) {
        List<Integer> fibonacci = new ArrayList<>();
        int prev;
        int current = 0;
        int next = 1;

        while (limit-- > 0) {
            fibonacci.add(current);
            prev = current;
            current = next;
            next = prev + current;
        }
        return fibonacci;
    }

    public int fibonacciRecursive(int n) throws InterruptedException {
        Thread.sleep(100);
        if (n <= 0 || n == 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public int fibonacci(int n, int mem[]) throws InterruptedException {
        Thread.sleep(100);
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (mem[n] > 0) {
            return mem[n];
        }
        mem[n] = fibonacci(n - 1, mem) + fibonacci(n - 2, mem);
        return mem[n];
    }

}
