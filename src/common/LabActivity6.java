/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Kyle Uhan
 */
public class LabActivity6 {

    public static void main(String[] args) {

        Employee e1 = new Employee("Tom", "Tommerson", "555-55-5555");
        Employee e2 = new Employee("Sneaky", "Sneakerson", "444-55-5555");
        Employee e3 = new Employee("Sally", "Sallerson", "333-55-5555");
        Employee e4 = new Employee("Bill", "Billerson", "444-55-5555");
        Employee e5 = new Employee("John", "Adams", "999-99-9999");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Map<String, Employee> employeeTreeMap = new TreeMap<>();
        for (Employee e : employees) {
            employeeTreeMap.put(e.getSsn(), e);
        }

        System.out.println("Values in Map:");
        for (String key : employeeTreeMap.keySet()) {
            System.out.println(employeeTreeMap.get(key));
        }

        System.out.println();

        Collection<Employee> employeeObjects = employeeTreeMap.values();
        List<Employee> orderedEmployeeList = new ArrayList<>(employeeObjects);

        System.out.println("Values in map ordered by First Name:");
        Collections.sort(orderedEmployeeList, new EmployeeByFirstName());
        for (Employee em : orderedEmployeeList) {
            System.out.println(em);
        }

        System.out.println();
        System.out.println("Values in map ordered by Last Name:");
        Collections.sort(orderedEmployeeList, new EmployeeByLastName());
        for (Employee em : orderedEmployeeList) {
            System.out.println(em);
        }

        System.out.println();
        System.out.println("Values in map ordered by SSN:");
        Collections.sort(orderedEmployeeList, new EmployeeBySSN());
        for (Employee em : orderedEmployeeList) {
            System.out.println(em);
        }
        
    }
}
