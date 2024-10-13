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

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TripletSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,15};
        int s = 18;
    }

    static  triplets(int arr[],int s){
        Set<Set<Integer>> resultSetOfSets = new TreeSet<>();
        Set<Integer> set = getSetFromArray(arr);
        for(int i=0;i<arr.length-2;i++){
            
        }
    }

    static boolean isPairPresent(int m, int n, Set<Integer> set){
        return set.contains(m) && set.contains(n);
    }

    static Set<Integer> getSetFromArray(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        return set;
    }

}
