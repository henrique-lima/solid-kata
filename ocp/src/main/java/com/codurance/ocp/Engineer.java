package com.codurance.ocp;

public class Engineer extends Employee {

    public Engineer(int salary) {
        this.salary = salary;
    }

    @Override
    public int payAmount() {
        return salary;
    }
}
