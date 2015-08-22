package com.test.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by malu on 8/22/2015.
 */
public class ManagerEmployee implements EmployeeComposite, Boss {

    private final String managerName;

    private final List<EmployeeComposite> emp = new ArrayList<EmployeeComposite>();

    public ManagerEmployee(final String managerName) {
        this.managerName = managerName;
    }

    public String getName() {
        return this.managerName;
    }

    public void showEmployees() {
        System.out.println("The manager [" + getName() + "] has.");

        for (EmployeeComposite ec : emp) {
            System.out.println(ec.getName());
        }
    }

    public boolean addEmployee(EmployeeComposite ec) {
        return emp.add(ec);
    }
}
