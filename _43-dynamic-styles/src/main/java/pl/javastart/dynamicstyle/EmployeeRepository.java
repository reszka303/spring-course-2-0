package pl.javastart.dynamicstyle;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@Repository
public class EmployeeRepository {

    private List<Employee> employees = List.of(
            new Employee(1L, "Jan", "Kowalski", new BigDecimal("4500")),
            new Employee(2L, "Paweł", "Abacki", new BigDecimal("6500")),
            new Employee(3L, "Marta", "Wolna", new BigDecimal("2900")),
            new Employee(4L, "Anna", "Piotrowska", new BigDecimal("2500")),
            new Employee(5L, "Karol", "Zawada", new BigDecimal("8900")),
            new Employee(6L, "Marta", "Król", new BigDecimal("2100"))
    );

    List<Employee> findAll() {
        return employees;
    }

    BigDecimal getAvgSalary() {
        BigDecimal salarySum = employees.stream()
                .map(Employee::getSalary)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return salarySum.divide(BigDecimal.valueOf(employees.size()), RoundingMode.HALF_UP);
    }
}
