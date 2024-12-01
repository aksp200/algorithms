package org.aks.algo;
/**
 * 
******Mountain******

Write a function that takes input an array of distinct integers, and returns the length of highest mountain.
A mountain is defined as adjacent integers that are strictly increasing until they reach a peak, at which the become strictly decreasing.
At least 3 numbers are required to form a mountain.


how to solve?
1. identify a peak (if a[i]>a[i-1] and a[i]>a[i+1] then a[i] is a peak) 
 * 
 */
public class Mountain {
    public static void main(String[] args) {
        Mountain m = new Mountain();
    	int arr[] = {5,6,1,2,3,4,5,4,3,2,0,1,2,3,-1,4};
    	System.out.println(m.highestMountain(arr));
    }

    int highestMountain(int a[]){
    	int max = 0;
        for(int i=1;i<a.length-1;i++){
        		int b=i;
        		int f=i;
        	if(a[i]>a[i-1]&&a[i]>a[i+1]){
        		while(b>0 && a[b-1]<a[b]) b--;
        		while(f<a.length-1 && a[f+1]<a[f]) f++;
        		int sum =(i-b)+(f-i)+1;
        		if(max<sum) max = sum;
        	}
        }
        return max;
    }
}
