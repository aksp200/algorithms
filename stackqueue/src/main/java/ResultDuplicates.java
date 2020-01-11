import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ResultDuplicates {
    /*
     * Complete the 'countDuplicates' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static int countDuplicates(List<Integer> numbers) {
        // Write your code here
        Map<Integer, Integer> mapCount = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();
        for (Integer i : numbers) {
            Integer count = mapCount.get(i);
            if (count == null) {
                count = 1;
            } else if (count != null) {
                count++;
                duplicates.add(i);
            }
            mapCount.put(i, count);
        }
        return duplicates.size();
    }
}
