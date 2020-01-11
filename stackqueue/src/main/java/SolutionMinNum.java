import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SolutionMinNum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int A = Integer.parseInt(bufferedReader.readLine().trim());

        int K = Integer.parseInt(bufferedReader.readLine().trim());

        int P = Integer.parseInt(bufferedReader.readLine().trim());

        int result = ResultPersonList.minNum(A, K, P);

        System.out.println(String.valueOf(result));

        bufferedReader.close();

    }
}
