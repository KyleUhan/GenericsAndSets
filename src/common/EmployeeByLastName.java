/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package common;

import java.util.Comparator;

/**
 *
 * @author Kyle Uhan
 */
public class EmployeeByLastName implements Comparator<Employee>{

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getLastName().compareTo(e2.getLastName());
    }
    
}
