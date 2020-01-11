public class ResultPersonList {
    /*
     * Complete the 'minNum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER A
     *  2. INTEGER K
     *  3. INTEGER P
     */

    public static int minNum(int A, int K, int P) {
        int minNum = 0;
        boolean isMore = false;
        while (!isMore) {
            minNum++;
            if (A * minNum + P < K * minNum) {
                isMore = true;
            }
        }
        return minNum;

    }
}
