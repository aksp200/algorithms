import java.util.Scanner;

public class SolutionPlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int positive=0;
        int negative=0;
        int zeros=0;
        for(int num:arr){
            if(num>0){
                positive++;
                continue;
            }
            if(num<0){
                negative++;
                continue;
            }
            if(num==0){
                zeros++;
            }
        }
        System.out.println((positive)/(positive+negative+zeros));
        System.out.println((negative)/(positive+negative+zeros));
        System.out.println((zeros)/(positive+negative+zeros));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
