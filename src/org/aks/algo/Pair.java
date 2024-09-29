package org.aks.algo;

import java.util.HashSet;
import java.util.Set;

public class Pair {

    public static void main(String[] args) {
        int [] arr = {10,5,2,3,-6,9,11};
        int s = 4;
        printArr(findPair(arr, s));
    }

    static void printArr(int [] arr){
        System.out.print("[");
        boolean isFirst = true;
        for(int i:arr){
            
            if(isFirst){
               isFirst =false;
            }
            else{
                System.out.print(",");
            }

            System.out.print(i);

        }
        System.out.println("]");
    }

    static int[] findPair(int arr[],int s){
        Set<Integer> uq = new HashSet<>();
        int[] result = new int[2];
        for(int i:arr){
            if(uq.contains(s-i)){
                result[0]=s-i;
                result[1]=i;
                break;
            }
            else{
                uq.add(i);
            }
        }
        return result;
    }
}
