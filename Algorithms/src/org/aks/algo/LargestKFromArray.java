/**
 *
 */
package org.aks.algo;

import javax.naming.directory.InvalidAttributesException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author aksma
 */
public class LargestKFromArray {

    /**
     * @param args
     * @throws InvalidAttributesException
     */
    public static void main(String[] args) throws InvalidAttributesException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of testcases : ");
        int t = scanner.nextInt();

        List<ArrayList<Integer>> listOfLists = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            System.out.println("test No. " + (i + 1));
            List<Integer> list = readIntArray(2);
            System.out.println("list : " + list);
            List<Integer> listToFindKLargest = readIntArray(list.get(0));
            listOfLists.add((ArrayList<Integer>) kLargestElements(listToFindKLargest, list.get(1)));
        }

        for (List<Integer> list : listOfLists) {
            System.out.println(list);
        }

    }

    public static List<Integer> readIntArray(int size) throws InvalidAttributesException {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        Scanner intScanner = new Scanner(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            if (intScanner.hasNextInt()) {
                list.add(intScanner.nextInt());
            }
        }
        if (!(list.size() == size)) {
            throw new InvalidAttributesException(String.format("Was expecting %d integers", size));
        }
        return list;
    }

    public static List<Integer> kLargestElements(List<Integer> list, int k) {
        return list;
    }

}
