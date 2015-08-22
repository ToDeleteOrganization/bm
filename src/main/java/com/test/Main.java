package com.test;

import com.test.composite.Boss;
import com.test.composite.EmployeeComposite;
import com.test.composite.ManagerEmployee;
import com.test.composite.NormalEmployee;

/**
 * Created by malu on 8/22/2015.
 */
public class Main {
    public static void main(String argsp[]) {

        EmployeeComposite ec = new NormalEmployee("Marius Cocoi");

        Boss man = new ManagerEmployee("Marius's boss");
        man.addEmployee(ec);
        man.addEmployee(new NormalEmployee("Ioan Marius"));
        
        System.out.println(ec.getName());
        man.showEmployees();
    }
}
