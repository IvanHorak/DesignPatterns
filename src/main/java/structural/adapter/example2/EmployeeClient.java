package structural.adapter.example2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee dbEmployee = new EmployeeDB("1234", "John", "Curton", "john_curton@mail.com");
        employees.add(dbEmployee);

        EmployeeLdap ldapEmployee = new EmployeeLdap("4321", "LDAP John", "LDAP Curton", "john_curton@mail.com");
        employees.add(new EmployeeAdapterLdap(ldapEmployee));

        return employees;
    }
}
