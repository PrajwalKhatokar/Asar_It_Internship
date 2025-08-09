package task2;


import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class LamdaInterface {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Prajwal", 60000),
                new Employee("Anu", 45000),
                new Employee("Vikram", 75000)
        );

        employees.stream()
                .filter(e -> e.salary > 50000) // Only high salary
                .forEach(e -> System.out.println(e.name + " earns " + e.salary));
    }
}

