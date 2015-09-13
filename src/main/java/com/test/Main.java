package com.test;

import com.test.composite.Boss;
import com.test.composite.EmployeeComposite;
import com.test.composite.ManagerEmployee;
import com.test.composite.NormalEmployee;

/**
 * Marius is trying, but his not succeding!
 */
public class Main {
    public static void main(String argsp[]) {

        EmployeeComposite ec = new NormalEmployee("Marius Cocoi");

        Boss man = new ManagerEmployee("Marius's boss");
        man.addEmployee(ec);
        man.addEmployee(new NormalEmployee("the master banrch: Ioan Marius Cocoi")); // this is the hotfix!!!

        System.out.println(ec.getName());
        man.showEmployees();
    }
}


this will fail