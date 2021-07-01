package org.aks.algo;

public class PascalsTriangle {

    public static void printTriangle(final int numberOfRows) {
        for (int row = 0; row < numberOfRows; row++) {
            System.out.printf("%" + 3 * (numberOfRows - row) + "S", "");
            int number = 1;
            for (int col = 0; col <= row; col++) {
                System.out.printf("%6d", number);
                number = number * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }
}
