/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Kyle Uhan
 */
public class LabActivity7 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Tom", "Tommerson", "555-55-5555");
        Employee e2 = new Employee("Bill", "Billerson", "444-55-5555");
        Employee e3 = new Employee("Sally", "Sallerson", "333-55-5555");
        Employee e4 = new Employee("Sneaky", "Sneakerson", "444-55-5555");
        Employee e5 = new Employee("John", "Adams", "999-99-9999");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Set<Employee> employeeTreeSet = new TreeSet<>();
        //Fill the TreeMap
        for (Employee e : employees) {
            employeeTreeSet.add(e);
        }

        System.out.println("Values in TreeSet:");
        for (Employee e : employeeTreeSet) {
            System.out.println(e);
        }

        System.out.println();

    }
}
