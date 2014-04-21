
package common;

import java.util.Comparator;

/**
 *
 * @author Kyle Uhan
 */
public class EmployeeBySSN implements Comparator<Employee> {

    @Override
    public final int compare(final Employee e1,final Employee e2) {
        return e1.getSsn().compareTo(e2.getSsn());
    }

}
