import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class SolutionEncircular {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new O);

        int commandsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> commands = IntStream.range(0, commandsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<String> result = ResultEncircular.doesCircleExist(commands);

        System.out.println(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();

    }
}