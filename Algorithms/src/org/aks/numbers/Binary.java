package org.aks.numbers;

import org.aks.util.IoUtil;

import java.util.Scanner;

public class Binary {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String number = IoUtil.readLine(scanner, "Enter a number : ");
        int base = Integer.parseInt(IoUtil.readLine(scanner, "Enter the base : "));
        System.out.println(convertFromBase(number, base));

    }

    private static int convertFromBase(String number, int base) {
        if (base < 2 ||
                (base > 10 && base != 16)) { //other that hexadecimal, other bases above 10 does not have proper representation.
            return -1;
        }
        int value = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = convertToDigit(number.charAt(i), base);
            int exp = number.length() - 1 - i;
            value += digit * Math.pow(base, exp);
        }
        return value;
    }

    private static int convertToDigit(char c, int base) {
        return Integer.parseInt(String.valueOf(c), base);
    }
}


