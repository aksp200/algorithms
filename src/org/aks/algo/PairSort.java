package org.aks.algo;

import java.util.ArrayList;
import java.util.List;

public class PairSort {

    public static void main(String[] args) {
        PairSort ps = new PairSort();
        int [] arr = {1, 2, 3, 4, 5, 8};
        int s = 7;
        for(int []ar:ps.findPair(arr, s) ){
            ps.printArr(ar);
        }
    }

    private void printArr(int [] arr){
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

    private int[][] findPair(int arr[],int sum){
        List<int[]> list = new ArrayList<>();
        int f=0,r=arr.length-1;
        while(f<r){
            if(arr[f]+arr[r]==sum){
                int []result = new int[2];
                result[0]=arr[f++];
                result[1]=arr[r--];
                list.add(result);
            } 
            if(arr[f]+arr[r]<sum) f++;
            if(arr[f]+arr[r]>sum) r--;
        }
        int[][] arr2d = new int[list.size()][2];
        int i=0;
        for(int[] ar : list){
            arr2d[i++]=ar;
        }
        return arr2d;
    }
}
