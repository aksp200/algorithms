package org.aks.algo;

public class ReverseArray {
    public static void main(String args[]){
        int arr[] ={1,2,3,4,5};
        ReverseArray reverseArray = new ReverseArray();
        reverse(arr);
        print(arr);
    }

    private static void reverse(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }

    private static void print(int arr[]){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
