package pl.javastart.company;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

//JPQL    @Query("SELECT e FROM Employee e WHERE e.salary > 10000")
    @Query(value = "SELECT * FROM Employee WHERE salary > 10000", nativeQuery = true)
    List<Employee> findRichEmployees();

//JPQL    @Query("UPDATE Employee e SET e.salary = e.salary + 100")
    @Query(value = "UPDATE Employee SET salary= salary + 100", nativeQuery = true)
    @Modifying
    @Transactional
    void giveRiseToAll();

    @Query(value = "SELECT id, first_name, last_name, salary from Employee WHERE salary BETWEEN :min AND :max", nativeQuery = true)
//JPQL    @Query("SELECT e FROM Employee e WHERE e.salary > :min AND e.salary < :max")
    List<Employee> findBySalaryInRange(double min, double max);
}
