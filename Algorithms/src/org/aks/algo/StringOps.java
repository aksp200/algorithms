package org.aks.algo;

class StringOps{
    @SuppressWarnings("all")
    public static void main(String args[]){
        String a = "abc";
        String b = new String("abc");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


    }
}