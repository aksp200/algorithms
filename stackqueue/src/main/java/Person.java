import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
    String firstName;
    String lastName;
    int age;
    String country;

    public Person(String firstName, String lastName, int age, String country) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return firstName + "|" + lastName + "|" + age + "|" + country;
    }
}

class PersonUtils {


    public static void sortPersons(List<Person> persons, String[] sortBy) {
        List<Comparator<Person>> comparators = new ArrayList<>();

        for (String comString : sortBy) {
            if ("firstName".equalsIgnoreCase(comString)) {
                comparators.add((dis, dat) -> {
                    return dis.getFirstName().compareTo(dat.getFirstName());
                });
            }
            if ("lastName".equalsIgnoreCase(comString)) {
                comparators.add((dis, dat) -> {
                    return dis.getLastName().compareTo(dat.getLastName());
                });
            }
            if ("age".equalsIgnoreCase(comString)) {
                comparators.add((dis, dat) -> {
                    return dis.getAge() - dat.getAge();
                });
            }
            if ("country".equalsIgnoreCase(comString)) {
                comparators.add((dis, dat) -> {
                    return dis.getCountry().compareTo(dat.getCountry());
                });
            }
        }
        for (Comparator<Person> comparator : comparators) {
            Collections.sort(persons, comparator);
        }
    }
}
