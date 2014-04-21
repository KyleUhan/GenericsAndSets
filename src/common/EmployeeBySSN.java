
package common;

import java.util.Comparator;

/**
 *
 * @author Kyle Uhan
 */
public class EmployeeBySSN implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSsn().compareTo(e2.getSsn());
    }

}
