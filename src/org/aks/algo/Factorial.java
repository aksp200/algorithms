package org.aks.algo;

import org.aks.util.IoUtil;

import java.util.Scanner;

public class Factorial {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = Integer.parseInt(IoUtil.readLine(scanner, "Enter an integer : "));
        System.out.printf("Factorial of %d is %d ", n, factorial(n));
    }

    private static int factorial(int n) {
        int factorial = 1;
        if (n < 0) {
            return -1;
        }
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
        }
        return factorial;
    }
}
