package challenge114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Halima", 3000),
                new Employee("Arshad", 1000),
                new Employee("Rehman", 4000),
                new Employee("Hafiz", 5000),
                new Employee("Nishat", 2000)

                );
        employees.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);

    }
}
