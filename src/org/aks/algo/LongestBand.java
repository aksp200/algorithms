package org.aks.algo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
Longest Band

Given an array containing N integers, find length of longest band.

A band is defined as a subsequence which can be re- ordered in such a manner all elements appear consecutive (ie with absolute difference of 1 between neighbouring elements)
A longest band is the band (subsequence) which contains maximum integers.

 * 
 */
public class LongestBand {
    public static void main(String[] args) {
        LongestBand l = new LongestBand();  
        int a[] = {1,9,3,0,18,5,2,4,10,7,12,6};  
        System.out.println(l.getLongestBand(a));
    }

    int getLongestBand(int a[]){
        Map<Integer,Integer> bandMap = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int i:a){
            set.add(i);
        }
        for(int i:a){
            int last = i;
            while(set.contains(last)) last++;
            int currentLast = last-i;
            if(max<currentLast) max=currentLast;  
        }
        return max;
    }

}
