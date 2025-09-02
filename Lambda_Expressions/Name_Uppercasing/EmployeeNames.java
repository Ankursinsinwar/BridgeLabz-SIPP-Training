package Lambda_Expressions.Name_Uppercasing;

import java.util.Arrays;
import java.util.List;

public class EmployeeNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ankur", "David");

        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
