import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the winningLotteryTicket function below.
    static long winningLotteryTicket(String[] tickets) {
        long pairsCount = 0;
        long[] ticketsIntRep = new long[1024];
        for (int i = 0; i < tickets.length; i++) {
            int location = getBinary(tickets[i]);
            ticketsIntRep[location] += 1L;
        }
        for (int i = 0; i < ticketsIntRep.length - 1; i++) {
            if (ticketsIntRep[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < ticketsIntRep.length; j++) {
                if ((i | j) == 1023) {
                    pairsCount += ticketsIntRep[i] * ticketsIntRep[j];
                }
            }
        }
        return pairsCount;
    }

    private static int getBinary(String s) {
        char[] bits = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
        for (char ch : s.toCharArray()) {
            bits[ch - 48] = '1';
        }
        return Integer.parseInt(new String(bits), 2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] tickets = new String[n];

        for (int i = 0; i < n; i++) {
            String ticketsItem = scanner.nextLine();
            tickets[i] = ticketsItem.trim();
        }

        long result = winningLotteryTicket(tickets);

        System.out.println(String.valueOf(result));


        scanner.close();
    }
}
