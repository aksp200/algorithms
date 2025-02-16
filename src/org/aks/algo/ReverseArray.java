package org.aks.algo;

import static org.aks.util.IoUtil.print;

public class ReverseArray {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        reverse(arr);
        print(arr);
    }

    private static void reverse(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
