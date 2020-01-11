package org.aks.probsolve; /**
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean isSync = false;
        if (x1 == x2) {
            isSync = true;
        }

        if (x1 != x2) {
            int d1, d2 = 0;
            d1 = x1;
            d2 = x2;
            for (int i = 0; i <= 200000; i++) {
                d1 += v1;
                d2 += v2;
                if(d1 == d2){
                    System.out.println(d1);
                    isSync = true;
                    break;
                }
            }
        }

        return isSync ? "YES" : "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter((new OutputStreamWriter(System.out)));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
