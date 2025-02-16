package org.aks.algo;

public class Bitwise {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(12));
        System.out.println(12>>2);
        System.out.println(12>>1);
        System.out.println(12>>1>>1);
        System.out.println(Integer.toBinaryString(3));


        //find odd and even
        int n = 11;
        if((n&1) == 0) System.out.println("even");
        else System.out.println("odd");

        //swap two numbers with XOR
        
        int n1=3;
        int n2=5;
        long time1 = System.nanoTime();
        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        time1 = System.nanoTime()-time1;
        System.out.println("n1:"+n1+"\t n2:"+n2);
        System.out.println("time taken :"+time1);
        long time2 = System.nanoTime();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        time2 = System.nanoTime()-time2;
        System.out.println("n1:"+n1+"\t n2:"+n2);
        System.out.println("time taken :"+time1);

    } 
}
