package org.aks.algo;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumWithLoop(10));
    }

    private static int sumWithLoop(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i;
            System.out.println("i="+i);
        }
        return sum;
    }
}
