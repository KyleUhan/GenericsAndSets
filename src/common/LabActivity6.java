/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
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

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        Map<String, Employee> employeeTreeMap =  new TreeMap<>();
        for (Employee e : employees) {
            employeeTreeMap.put(e.getSsn(), e);
        }
        
        for(int i = 0; i < employees.size(); i++){
            System.out.println(employees.get(i).compareTo(e3));
        }
        System.out.println("--");

        for (Employee em : employeeTreeMap.values()) {
            System.out.println("Obj: " + em + "\nkey - " + em.getSsn() + "\n");
        }
        
    }
}
