import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionPersonList {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String[] res;
        int count = 0;
        // read the first line the number indicates number of person records below
        // person records start from 3rd line
        try {
            count = Integer.parseInt(in.nextLine());
        } catch (Exception e) {
            count = 0;
        }

        // read the 2nd line; the sort options are given in this line
        String sortLine = in.nextLine();
        String[] sortBy = sortLine.split(";");

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String inputLine = in.nextLine();
            // the person details are given in this order:
            // first name; last name; age; country
            String[] parts = inputLine.split("[|]");
            Person person = new Person(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]);
            personList.add(person);
        }
        PersonUtils.sortPersons(personList, sortBy);

        for (Person p : personList) {
            System.out.println(p.toString());

        }
        in.close();

    }
}
