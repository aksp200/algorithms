package org.aks.algo;

public class RainTrap {
    public static void main(String[] args) {
        RainTrap r = new RainTrap();
        int a[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(r.totalRainTrapped(a));
    }

    int totalRainTrapped(int a[]) {
        int al[] = new int[a.length];
        int ar[] = new int[a.length];
        int totalRain = 0;
        int l = 0, r = 0;
        for (int h = 0; h < a.length; h++) {
            if (l < a[h]) l = a[h];
            al[h] = l;
        }
/* 
        System.out.println("left");
        print(al);
*/
        for(int i=a.length-1;i>=0;i--){
            if(r < a[i]) r = a[i];
            ar[i] = r;
        }
/* 
        System.out.println("right");
        print(ar);
        System.out.println("arr");
        print(a);
*/
        for (int i = 0; i < a.length; i++) {
            totalRain = totalRain + (Math.min(al[i], ar[i]) - a[i]);
        }
        return totalRain;
    }

    void print(int a[]){
        System.out.print("[");
        for(int i:a){
            System.out.print(i+",");
        }
        System.out.println("]");
    }
}
