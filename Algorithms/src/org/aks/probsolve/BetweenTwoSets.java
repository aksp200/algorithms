package org.aks.probsolve;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */
class Results {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        List<Integer> modANums = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            boolean isDivA = true;
            for (int num : a) {
                if (i % num != 0) {
                    isDivA = false;
                    break;
                }
            }
            if (isDivA) {
                modANums.add(i);
            }
        }
        System.out.println(modANums);
        List<Integer> modBNums = new ArrayList<>();


        for (int aNum : modANums) {
            boolean isDivB = true;
            for (int num : b) {
                if (num % aNum != 0) {
                    isDivB = false;
                    break;
                }
            }
            if(isDivB){
                modBNums.add(aNum);
            }
        }
        System.out.println(modBNums);
        return modBNums.size();
    }
}

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Results.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
