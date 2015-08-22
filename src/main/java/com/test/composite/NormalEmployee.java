package com.test.composite;

/**
 * Created by malu on 8/22/2015.
 */
public class NormalEmployee implements EmployeeComposite {

    private final String employeeName;

    public NormalEmployee(final String en) {
        this.employeeName = en;
    }

    public String getName() {
        return this.employeeName;
    }
}
