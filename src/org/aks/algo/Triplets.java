package org.aks.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * Triplets
 * Given an array containing N integers, and an number S denoting a target sum.
 * Find all distinct integers that can add up to form target sum. The numbers in
 * each triplet should be ordered in ascending order, and triplets should be
 * ordered too.
 * Return empty array if no such triplet exists.
 * 
 * Input
 * array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 15]
 * target = 18
 * 
 * Output
 * [[1, 2, 15],
 * [3, 7, 8],
 * [4, 6, 8],
 * [5, 6, 7]]
 * 
 */
public class Triplets {

    public static void main(String[] args) {
        Triplets t = new Triplets();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 };
        int arr2d[][] = t.findTriplets(arr, 18);
        t.print2DArr(arr2d);

    }

    int[][] findTriplets(int[] arr, int sum) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int pair[] = findPair(Arrays.copyOfRange(arr, i + 1, arr.length), sum - arr[i]);
            if(pair!=null){
                int triplet[] = new int[3];
                triplet[0] = arr[i];
                triplet[1] = pair[0];
                triplet[2] = pair[1];
                list.add(triplet);
            }
            printListArr(list);
        }
        return listToArr(list);
    }

    void printListArr(List<int[]> list){
        for(int ar[]:list){
            printArr(ar);
        }
    }

    int[][] listToArr(List<int[]> list) {
        int[][] resultArr = new int[list.size()][list.get(0).length];
        for (int i = 0; i < list.size(); i++) {
            resultArr[i] = list.get(i);
        }
        return resultArr;
    }

    int[][] convertNx2ToNx3(int[][] arr, int append) {
        if (arr == null)
            return null;
        if (arr.length == 0)
            return arr;
        if (arr[0].length == 0)
            return arr;
        int[][] resultArr = new int[arr.length][arr[0].length + 1];
        int i = 0;
        for (int ar[] : arr) {
            resultArr[i][0] = append;
            resultArr[i][1] = ar[0];
            resultArr[i][2] = ar[1];
        }
        return resultArr;
    }

    void print2DArr(int[][] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            printArr(arr[i]);
        }
        System.out.println("]");
    }

    private void printArr(int[] arr) {
        if(arr==null) return;

        System.out.print("[");
        boolean isFirst = true;
        for (int i : arr) {

            if (isFirst) {
                isFirst = false;
            } else {
                System.out.print(",");
            }

            System.out.print(i);

        }
        System.out.println("]");
    }

    private int[] findPair(int arr[], int sum) {
        int f = 0, r = arr.length - 1;
        int[] result = null;
        System.out.println("finding for :");
        printArr(arr);
        System.out.println(sum);
        while (f < r) {
            if (arr[f] + arr[r] == sum) {
                result = new int[2];
                result[0] = arr[f];
                result[1] = arr[r];
                break;
            }
            if(arr[f]+arr[r]<sum)f++;
            if(arr[f]+arr[r]>sum)r--;
        }
        printArr(result);
        return result;
    }

}
