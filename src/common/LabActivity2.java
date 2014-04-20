/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kyle Uhan
 */
public class LabActivity2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom", "Tommerson", "555-55-5555");
        Employee e2 = new Employee("Bill", "Billerson", "444-55-5555");
        Employee e3 = new Employee("Sally", "Sallerson", "333-55-5555");
        Employee e4 = new Employee("Sneaky", "Sneakerson", "444-55-5555");

        List employees = new ArrayList();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println("Size of employee Array: " + employees.size());
        System.out.println("");
        
        Employee fromList = (Employee) employees.get(1);
        System.out.println(fromList.toString());
        System.out.println();

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).toString());
        }
        
        System.out.println();
        
        Object[] employeeArray = employees.toArray();
        int count = 0;
        for(Object o : employeeArray){
            employeeArray[count] = (Employee)employeeArray[count];
            count++;
        }
        
        System.out.println(employees.contains(e4));
    }
}
