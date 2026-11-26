
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MethodRefExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Deeksha", "Bhoomi", "Kaveri", "Gagana", "Chaithanya");

        Stream<String> stream = names.stream();
        Optional<String> name = names.stream().filter(str -> str.contains("Bhoomi")).findFirst();
        System.out.println(name);

        List<String> name2 = names.stream().map(String::toUpperCase).toList();
        System.out.println(name2);

        List<String> name3 = names.stream().map(String::toLowerCase).toList();
        System.out.println(name3);

    }

}
