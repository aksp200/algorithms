package org.aks.util;

import java.util.List;

public class AlgoUtils {
    public static <T extends Comparable<? super T>> void swapIfSmaller(List<T> list, int i, int j) {
        T ith = list.get(i);
        T jth = list.get(j);
        if (ith.compareTo(jth) > 0) {
          swap(list,i,j);
        }
    }

    public static <T extends Comparable<? super T>> boolean isJSmaller(List<T> list, int i, int j) {
        T ith = list.get(i);
        T jth = list.get(j);
        if (jth.compareTo(ith) > 0) {
            return false;
        }
        return true;
    }

    public static <T extends Comparable<? super T>> void swap(List<T> list, int smallerIndex, int largerIndex) {
        if(smallerIndex==largerIndex){
            return;
        }
        T ith = list.remove(smallerIndex);
        T jth =list.remove(largerIndex-1);
        list.add(smallerIndex, jth);
        list.add(largerIndex, ith);
    }

    public static <T extends Comparable<? super T>> void swapIfSmaller(List<T> list, T min,int minIndex, int j) {
        T jth = list.get(j);
        T ith = list.get(minIndex);
        if (min.compareTo(jth) > 0) {
          swap(list,minIndex,j);
        }
    }


}

