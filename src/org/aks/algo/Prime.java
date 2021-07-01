package org.aks.algo;

import org.aks.util.IoUtil;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        n = Integer.parseInt(IoUtil.readLine(scanner,"Enter an integer : "));
        System.out.printf("Is %d prime ? : %b ",n,isPrime(n));
    }

    public static boolean isPrime(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
