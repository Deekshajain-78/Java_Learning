
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalClass {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Deeksha", "Bhoomi", "Kaveri", "Gagana", "Chaithanya");

        Stream<String> stream = names.stream();
        Optional<String> name = names.stream().filter(str -> str.contains("Bhoomi")).findFirst();
        System.out.println(name);

        String name2 = names.stream().filter(str -> str.contains("Bhoomi")).findFirst().orElse("no value");
        System.out.println(name2);

    }

}
