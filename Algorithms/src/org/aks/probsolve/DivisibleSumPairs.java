package org.aks.probsolve;

/**
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 * <p>
 * <p>
 * You are given an array of  integers, , and a positive integer, . Find and print the number of  pairs where  and  +  is divisible by .
 * <p>
 * For example,  and . Our three pairs meeting the criteria are  and .
 * <p>
 * Function Description
 * <p>
 * Complete the divisibleSumPairs function in the editor below. It should return the integer count of pairs meeting the criteria.
 * <p>
 * divisibleSumPairs has the following parameter(s):
 * <p>
 * n: the integer length of array
 * ar: an array of integers
 * k: the integer to divide the pair sum by
 * Input Format
 * <p>
 * The first line contains  space-separated integers,  and .
 * The second line contains  space-separated integers describing the values of .
 * <p>
 * Constraints
 * <p>
 * Output Format
 * <p>
 * Print the number of  pairs where  and  +  is evenly divisible by .
 * <p>
 * Sample Input
 * <p>
 * 6 3
 * 1 3 2 6 1 2
 * Sample Output
 * <p>
 * 5
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class DivisibleSumPairs {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
