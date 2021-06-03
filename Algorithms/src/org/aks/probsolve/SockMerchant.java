package org.aks.probsolve;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer,Integer> integerMap = new HashMap<>();
        for(int i:ar){
            Integer val = integerMap.get(i);
            if(val==null){
                integerMap.put(i,1);
            }
            else {
                integerMap.put(i,val+1);
            }
        }
        int pairs = 0;
        for (Integer key : integerMap.keySet()){
            pairs += integerMap.get(key)/2;
        }
        return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println(result);

        scanner.close();
    }
}
