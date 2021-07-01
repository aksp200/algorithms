package org.aks.algo;

import org.aks.util.IoUtil;

import java.util.Scanner;

public class PowersOf2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = Integer.parseInt(IoUtil.readLine(scanner, "Enter an integer : "));
        powersOf2(n);
    }

    private static int powersOf2(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            System.out.println(n);
            return n;
        }
        int prev = powersOf2(n / 2);
        int current = prev * 2;
        System.out.println(current);
        return current;
    }
}
