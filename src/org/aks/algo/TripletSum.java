package org.aks.algo;

/**
 * Triplets

Given an array containing N integers, and an number S denoting a target sum.

Find all distinct integers that can add up to form target sum. 
The numbers in each triplet should be ordered in ascending order, and triplets should be ordered too.

Return empty array if no such triplet exists.

    a+b+c = s
    

 * 
 */

import java.util.ArrayList;
import java.util.List;

public class TripletSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 };
        int s = 18;
        print(triplets(arr, s));
    }

    static int[][] triplets(int arr[], int s) {
        List<int[]> tList = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == s) {
                    int []triplet = new int[3];
                    triplet[0]=arr[i];
                    triplet[1]=arr[j];
                    triplet[2]=arr[k];
                    tList.add(triplet);
                    j++;
                    k--;
                }
                if (sum<s) {
                    j++;
                }
                if(sum>s){
                    k--;
                }
            }
        }
        return listToArr(tList);
    }

    static int[][] listToArr(List<int[]> list) {
        int arr2d[][] = new int[list.size()][3];
        for (int i = 0; i < list.size(); i++) {
            arr2d[i] = list.get(i);
        }
        return arr2d;
    }

    static void print(int [][] a){
        for(int ar[]:a){
            System.out.print("[");
            for(int i:ar){
                System.out.print(" "+i);
            }
            System.out.print("]\n");
        }
    }
}
