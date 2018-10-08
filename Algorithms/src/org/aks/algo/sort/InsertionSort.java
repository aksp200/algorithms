package org.aks.algo.sort;

import org.aks.util.IoUtil;

import java.util.List;
import java.util.Scanner;

import static org.aks.util.AlgoUtils.isSecondSmaller;
import static org.aks.util.AlgoUtils.swap;
import static org.aks.util.StringUtils.splitWithSeparator;
import static org.aks.util.StringUtils.stringToInt;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String intsString = IoUtil.readLine(scanner, "Enter comma separated list of integers : ");
        List<String> intsStringList = splitWithSeparator(intsString, ",");
        List<Integer> ints = stringToInt(intsStringList);
        System.out.printf("List before sort\n %s \n", ints);
        System.out.println(System.currentTimeMillis());
        insertionSort(ints);
        System.out.println(System.currentTimeMillis());
        System.out.printf("Sorted List\n %s \n", ints);
    }

    public static <T extends Comparable> void insertionSort(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            int markerIndex = i;
            T marker = list.get(markerIndex);
            int j;
            for (j = i - 1; j >= 0 && isSecondSmaller(list, j, markerIndex); j--) {
               list.set(j+1,list.get(j));
            }
            list.set(j + 1, marker);
        }
    }
}
