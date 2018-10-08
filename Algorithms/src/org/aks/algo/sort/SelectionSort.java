package org.aks.algo.sort;

import org.aks.util.IoUtil;

import java.util.List;
import java.util.Scanner;

import static org.aks.util.AlgoUtils.isJSmaller;
import static org.aks.util.AlgoUtils.swap;
import static org.aks.util.StringUtils.splitWithSeparator;
import static org.aks.util.StringUtils.stringToInt;

public class SelectionSort {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String intsString = IoUtil.readLine(scanner, "Enter comma separated list of integers : ");
        List<String> intsStringList = splitWithSeparator(intsString, ",");
        List<Integer> ints = stringToInt(intsStringList);
        System.out.printf("List before sort\n %s \n", ints);
        System.out.println(System.currentTimeMillis());
        selectionSort(ints);
        System.out.println(System.currentTimeMillis());
        System.out.printf("Sorted List\n %s \n", ints);
    }

    public static <T extends Comparable> void selectionSort(List<T> list) {
        for (int i = 0; i < list.size(); i++) {
            int minIndex = i;
            for (int j = i+1; j < list.size(); j++) {
                if (isJSmaller(list, minIndex, j)) {
                    minIndex = j;
                }
            }
            swap(list, i, minIndex);
        }
    }
}
