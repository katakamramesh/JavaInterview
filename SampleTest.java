import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SampleTest {

    //Record Employee;{String name; double salary; LocalDate hireDate; String department;}

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Alice", 70000, LocalDate.of(2016, 3, 15), "Engineering"),
                new Employee("Bob", 80000, LocalDate.of(2018, 7, 1), "Engineering"),
                new Employee("Charlie", 90000, LocalDate.of(2015, 6, 20), "HR"),
                new Employee("David", 60000, LocalDate.of(2019, 9, 10), "HR"),
                new Employee("Eve", 75000, LocalDate.of(2020, 2, 25), "Finance"));
        /// Write a Java 8 program that processes a list of Employee objects to find the
        //	 average salary in departments with fewer than 10 employees.

        //employees.stream().map(Collectors.groupingBy(e -> e.getClass().)).average().

    }
}
