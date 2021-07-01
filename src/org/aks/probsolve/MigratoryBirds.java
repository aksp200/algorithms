package org.aks.probsolve;

/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MigratoryBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> birdMap = new HashMap<>();
        for (int bird : arr) {
            if (birdMap.keySet().contains(bird)) {
                birdMap.put(bird, (birdMap.get(bird)) + 1);
            } else {
                birdMap.put(bird, 1);
            }
        }
        int maxCountedBird = 0;
        int maxCount = 0;
        for (int bird : birdMap.keySet()) {
            if (maxCount < birdMap.get(bird)) {
                maxCountedBird = bird;
                maxCount = birdMap.get(bird);
            }
        }
        return maxCountedBird;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
