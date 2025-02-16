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

        //find ith bit is zero or 1
        n1 = 1000;
        System.out.println(Integer.toBinaryString(n1));

        n =6;
        System.out.printf("\n\nfinding %dth bit\n",n);
        int mask = 1;
        mask=mask<<n-1;
        System.out.println(Integer.toBinaryString(mask ));
        System.out.println(mask & n1);
        if((mask & n1) == 0) System.out.printf("%dth bit is zero\n",n);
        else System.out.printf("%dth bit is one\n",n);

        n=2;
        System.out.printf("\n\nfinding %dth bit\n",n);
        mask = 1;
        mask=mask<<n-1;
        System.out.println(Integer.toBinaryString(mask ));
        System.out.println(mask & n1);
        if((mask & n1) == 0) System.out.printf("%dth bit is zero\n",n);
        else System.out.printf("%dth bit is one\n",n);


        //set ith bit
        n1 = 1000;
        n=3;
        System.out.println("number before setting the bit "+Integer.toBinaryString(n1));
        System.out.printf("set %dth bit\n",n);
        mask = 1;
        System.out.println("test: "+Integer.toBinaryString(mask<<n));
        mask=mask<<n-1;
        System.out.println(Integer.toBinaryString(mask));
        n1=n1|mask;
        System.out.println("number after setting the bit "+Integer.toBinaryString(n1));
        
        
        //clear ith bit
        n1 = 1000;
        n=4;
        System.out.println("number before clearing the bit "+Integer.toBinaryString(n1));
        System.out.printf("clear %dth bit\n",n);
        mask = 1;
        mask=mask<<n-1;
        mask=~mask;
        System.out.println(Integer.toBinaryString(mask));
        n1=n1&mask;
        System.out.println("number after clearing the bit "+Integer.toBinaryString(n1));

    } 
}
