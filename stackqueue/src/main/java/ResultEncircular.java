import java.util.ArrayList;
import java.util.List;

public class ResultEncircular {

    /*
     * Complete the 'doesCircleExist' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY commands as parameter.
     */

    public static List<String> doesCircleExist(List<String> commands) {
        // Write your code here
        List<String> doesExistList = new ArrayList<>();
        for (String command : commands) {
            doesExistList.add(doesCircleExist(command));
        }
        return doesExistList;
    }

    public static String doesCircleExist(String command) {
        // Write your code here
        boolean doesExist = false;
        int x = 0;
        int y = 0;
        char dir[] = {'e', 's', 'w', 'n'};
        char commands[] = command.toCharArray();
        int dirIndexAtStart = 0;
        int dirIndex = 0;
        for (char ch : commands) {
            if (ch == 'L') {
                dirIndex = moveL(dirIndex);
            }
            if (ch == 'R') {
                dirIndex = moveR(dirIndex);
            }
            if (ch == 'G') {
                List<Integer> point = new ArrayList<>();
                point.add(x);
                point.add(y);
                go(point, dir[dirIndex]);
                x = point.get(0);
                y = point.get(1);
            }
        }
        doesExist = (dirIndexAtStart != dirIndex);
        return yesNo(doesExist);
    }

    static int moveR(int dirIndex) {
        return (dirIndex + 1) % 4;
    }

    static int moveL(int dirIndex) {
        return (dirIndex + 3) % 4;
    }

    static List<Integer> go(List<Integer> point, char dir) {
        Integer y = point.get(1);
        Integer x = point.get(0);
        switch (dir) {
            case 'e':
                y++;
                break;
            case 'w':
                y--;
                break;
            case 'n':
                x--;
                break;
            case 's':
                x++;
                break;
            default:

        }
        point.add(0, x);
        point.add(1, y);
        return point;
    }

    public static String yesNo(boolean input) {
        if (input) {
            return "YES";
        }
        return "NO";
    }
}
