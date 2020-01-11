import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SamAppleOrangeSolution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        calculateActualDistance(apples, a);
        calculateActualDistance(oranges, b);
        Set<Integer> rangeOfHouseSet = getRangeOfHouseSet(s, t);
        apples = removeOutOfRange(apples, rangeOfHouseSet);
        oranges = removeOutOfRange(oranges, rangeOfHouseSet);
        System.out.println(apples.length);
        System.out.println(oranges.length);
    }

    static int actualDistance(int relativeDistance, int referencePoint) {
        return relativeDistance + referencePoint;
    }

    static Set<Integer> getRangeOfHouseSet(int s, int t) {
        Set<Integer> rangeOfHouseSet = new HashSet<>();
        for (int i = s; i <= t; i++) {
            rangeOfHouseSet.add(i);
        }
        return rangeOfHouseSet;
    }

    static void calculateActualDistance(int[] relativeDistanceArray, int referencePoint) {
        for (int i = 0; i < relativeDistanceArray.length; i++) {
            relativeDistanceArray[i] = actualDistance(relativeDistanceArray[i], referencePoint);
        }
    }

    static int[] removeOutOfRange(int[] fruits, Set<Integer> rangeOfHouseSet) {
        List<Integer> fruitsInRange = new ArrayList<>();
        for (int fruit : fruits) {
            if (rangeOfHouseSet.contains(fruit)) {
                fruitsInRange.add(fruit);
            }
        }
        return fruitsInRange.stream().mapToInt(i -> i).toArray();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}

