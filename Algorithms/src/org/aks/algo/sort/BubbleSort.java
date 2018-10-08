package org.aks.algo.sort;

import org.aks.util.IoUtil;

import java.util.List;
import java.util.Scanner;

import static org.aks.util.AlgoUtils.swapIfSmaller;
import static org.aks.util.StringUtils.splitWithSeparator;
import static org.aks.util.StringUtils.stringToInt;

public class BubbleSort {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String intsString = IoUtil.readLine(scanner, "Enter comma separated list of integers : ");
        List<String> intsStringList = splitWithSeparator(intsString, ",");
        List<Integer> ints = stringToInt(intsStringList);
        bubbleSort(ints);
        System.out.printf("Sorted List %s ", ints);
    }

    public static <T extends Comparable> void bubbleSort(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < i; j++) {
                swapIfSmaller(list, i, j);
            }
        }
    }
}
