package org.aks.algo;

import org.aks.util.IoUtil;

import java.util.Scanner;

public class StringPermitations {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = IoUtil.readLine(scanner, "Enter a string : ");
        System.out.printf("permutations of string %s : \n", str);
        permuation(str,"");
    }

    /**
     * O(n^2 * n!)
     *
     * @param str    string for permutation
     * @param prefix to be used for permutation with given string
     */
    private static void permuation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permuation(rem, prefix + str.charAt(i));
            }
        }
    }

}
