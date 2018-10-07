package org.aks.algo;

import org.aks.util.IoUtil;

import java.math.BigDecimal;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal n;
        n = new BigDecimal(IoUtil.readLine(scanner, "Enter an integer : ").trim());
        System.out.printf("Square root of %s is %s ", n.toPlainString(), squareRoot(n, BigDecimal.ONE, n, 8).setScale(8, BigDecimal.ROUND_FLOOR).toPlainString());
    }

    private static int squareRoot(int n, int min, int max) {

        if (n < 0) {
            return -1;
        }
        if (n == 1 || n == 0) {
            return n;
        }
        int avg = (min + max) / 2;
        int avgSq = avg * avg;
        if (avgSq == n) {
            return avg;
        }
        if (min == avg) {
            System.out.printf("Square root of %d is between %d and %d ", n, min, max);
            System.exit(1);
        }
        if (avgSq > n) {
            return squareRoot(n, 1, avg);
        }
        return squareRoot(n, avg, max);
    }

    private static double squareRoot(double n, double min, double max) {

        if (n < 0) {
            return -1;
        }
        if (n == 1 || n == 0) {
            return n;
        }
        double avg = (min + max) / 2.0;
        double avgSq = avg * avg;
        if (avgSq == n) {
            return avg;
        }
        if (min == avg) {
            System.out.printf("Square root of %d is between %d and %d ", n, min, max);
            System.exit(1);
        }
        if (avgSq > n) {
            return squareRoot(n, min, avg);
        }
        return squareRoot(n, avg, max);
    }

    private static BigDecimal squareRoot(BigDecimal n, BigDecimal min, BigDecimal max, int precision) {

        if (n.compareTo(BigDecimal.ZERO) < 0) {
            return BigDecimal.valueOf(-1);
        }
        if (n.compareTo(BigDecimal.ONE) == 0 || n.compareTo(BigDecimal.ZERO) == 0) {
            return n;
        }
        BigDecimal avg = min.add(max).divide(BigDecimal.valueOf(2));
        BigDecimal avgSq = avg.multiply(avg);
        if (avgSq.setScale(precision, BigDecimal.ROUND_FLOOR).compareTo(n.setScale(precision, BigDecimal.ROUND_FLOOR)) == 0) {
            return avg;
        }
        if (avgSq.compareTo(n) > 0) {
            return squareRoot(n, min, avg, precision);
        }
        return squareRoot(n, avg, max, precision);
    }

}
