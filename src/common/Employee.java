package common;

import java.util.*;
//import org.apache.commons.lang3.builder.CompareToBuilder;

public class Employee implements Comparable {

    private String lastName;
    private String firstName;
    private String ssn;

    public Employee(final String firstName, final String lastName, final String ssn) throws IllegalArgumentException {
        setLastName(lastName);
        setFirstName(firstName);
        setSsn(ssn);
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(final String ssn) throws IllegalArgumentException {
        validateString(ssn);
        if (ssn.length() > 11) {
            throw new IllegalArgumentException("Please enter a valid SSN format "
                    + "xxxxxxxxx or xxx-xx-xxxx. " + " User Entery: " + ssn + " is"
                    + " not a valid format.");
        }
        this.ssn = ssn;
    }

    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(final String firstName) {
        validateString(firstName);
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(final String lastName) {
        validateString(lastName);
        this.lastName = lastName;
    }

    private void validateString(final String s) throws IllegalArgumentException {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException("Must enter a valid String.");
        }
    }

    @Override
    public final int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public final boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public final String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + '}';
    }

    @Override
    public final int compareTo(final Object o) {
        final int EQUAL = 0;
        Employee e = (Employee) o;

        int comparison = this.getSsn().compareTo(e.getSsn());
        if (comparison != EQUAL) {
            return comparison;
        }

        return EQUAL;
        //return new CompareToBuilder().append(this.getSsn(), obj.getSsn()).toComparison();

    }

}
