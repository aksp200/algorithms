package org.aks.probsolve;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DrawingBook {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        if(p==1){
            return 0;
        }
        if(n-p==1 && n%2==0){
            return 1;
        }
        if(n-p==1 && n%2==1){
            return 0;
        }
        if(n/2<n-p){

            return p/2;
        }
        else
        {
            return (n-p)/2;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        System.out.println(result);
        scanner.close();
    }
}
