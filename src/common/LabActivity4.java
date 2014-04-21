
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Kyle Uhan
 */
public class LabActivity4 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Tom", "Tommerson", "555-55-5555");
        Employee e2 = new Employee("Bill", "Billerson", "444-55-5555");
        Employee e3 = new Employee("Sally", "Sallerson", "333-55-5555");
        Employee e4 = new Employee("Sneaky", "Sneakerson", "444-55-5555");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println("Size of employee Array: " + employees.size());
        System.out.println("");

        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        System.out.println();

        Set<Employee> employeesStrict = new LinkedHashSet<>(employees);
        employees = new ArrayList<>(employeesStrict);

        for (Employee e : employees) {
            System.out.println(e.toString());
        }

    }

}
