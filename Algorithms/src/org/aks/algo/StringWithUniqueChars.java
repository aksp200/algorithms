package org.aks.algo;

import java.util.Scanner;

import static org.aks.util.IoUtil.readLine;

public class StringWithUniqueChars {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = readLine(scanner, "Enter a string with unique characters : ");
        boolean hasUnique = hasUniqueChars(str);
        System.out.printf("Has string \"%s\" all unique characters? : %b ",str,hasUnique);
    }

    private static boolean hasUniqueChars(String str) {
        boolean booleans[] = new boolean[430000000];
        char[] strChars = str.toCharArray();
        for(char ch : strChars){
            if(booleans[(int)ch]){
                System.out.printf("duplicate : %c\n",ch);
                return false;
            }
            booleans[(int)ch]=true;
        }
        return true;
    }
}
