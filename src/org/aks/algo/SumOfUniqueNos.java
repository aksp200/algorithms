package org.aks.algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given 3 int values, a b c, return their sum. 
 * However, if one of the values is the same as another of the values, it does not count towards the sum.
 * 
 */
public class SumOfUniqueNos {

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {3, 2, 3};
        Integer[] arr3 = {3, 3, 3};
        System.out.println("sum 1 "+uniqueSum(Arrays.asList(arr1)));
        System.out.println("sum 2 "+uniqueSum(Arrays.asList(arr2)));
        System.out.println("sum 3 "+uniqueSum(Arrays.asList(arr3)));
    }

    static int uniqueSum(List<Integer> list){
        Map<Integer,Integer> cMap = new HashMap<>();
        int sum = 0;
        for(Integer i : list){
            Integer count = cMap.get(i);
            if(count!=null) count++;
            else if(count==null) count=1;
            cMap.put(i, count);
        }
      
        for(Integer key : cMap.keySet()){
            if(cMap.get(key)==1){
                sum+=key;
            }
        }
        return sum;
    }
    
}
