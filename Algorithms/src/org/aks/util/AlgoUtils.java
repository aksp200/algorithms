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

    public static <T extends Comparable<? super T>> boolean isSecondSmaller(List<T> list, int i, int j) {
        T ith = list.get(i);
        T jth = list.get(j);
        if (jth.compareTo(ith) > 0) {
            return false;
        }
        return true;
    }

    public static <T extends Comparable<? super T>> boolean isSmaller(List<T> list, int i,T marker) {
        T ith = list.get(i);
        if (marker.compareTo(ith) > 0) {
            return false;
        }
        return true;
    }

    public static <T extends Comparable<? super T>> void swap(List<T> list, int smallerIndex, int largerIndex) {
        T ith = list.get(smallerIndex);
        T jth =list.get(largerIndex);
        list.set(smallerIndex, jth);
        list.set(largerIndex, ith);
    }

    public static <T extends Comparable<? super T>> void swapIfSmaller(List<T> list, T min,int minIndex, int j) {
        T jth = list.get(j);
        T ith = list.get(minIndex);
        if (min.compareTo(jth) > 0) {
          swap(list,minIndex,j);
        }
    }


}

