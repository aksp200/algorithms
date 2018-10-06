/**
 *
 */
package org.aks.util;

import java.util.Scanner;

/**
 * @author akshay
 */
public class IoUtil {

    public static String readLine(Scanner scanner, String message) {
        String nextLine = null;
        System.out.println(message);
        nextLine = scanner.nextLine();
        return nextLine;
    }

    public static void print(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
