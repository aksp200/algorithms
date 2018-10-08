package org.aks.util;

import java.util.List;

public class AlgoUtils {
    public static <T extends Comparable<? super T>> void swapIfSmaller(List<T> list, int i, int j) {
        T ith = list.get(i);
        T jth = list.get(j);
        if (jth.compareTo(ith) > 0) {
            list.remove(j);
            list.remove(i - 1);


            list.add(j, ith);
            list.add(i, jth);
        }
    }
}

