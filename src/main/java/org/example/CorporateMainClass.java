package org.example;

public class CorporateMainClass {

    public static void main(String[] args) {

        DeveloperInheritenceChildClass develpoerssalary = new  DeveloperInheritenceChildClass();

        System.out.println(develpoerssalary.salary + develpoerssalary.bonus);

        PrdtOwnInheritenceChildClass prdtOwnsalary = new PrdtOwnInheritenceChildClass();

        System.out.println(prdtOwnsalary.salary + prdtOwnsalary.bonus);

        TesterInheritanceChild testerSalary = new TesterInheritanceChild();
        System.out.println(testerSalary.salary);


    }

}
