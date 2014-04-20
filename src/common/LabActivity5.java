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

/**
 *
 * @author Kyle Uhan
 */
public class LabActivity5 {

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

        System.out.println("Size of employee Array: " + employees.size());
        System.out.println("");

        for (Employee e : employees) {
            System.out.println(e.toString());
        }
        
        System.out.println();

        Map<String,Employee> employeeMap = new HashMap<>();
        for(Employee e: employees){
            employeeMap.put(e.getSsn(), e);
        }
        
         System.out.println(employeeMap.keySet());
         System.out.println("");
         for(Employee em : employees){
             System.out.println(employeeMap.get(em.getSsn()));
         }

    }

    
}