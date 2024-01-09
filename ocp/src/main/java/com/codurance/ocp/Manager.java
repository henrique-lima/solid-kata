package com.codurance.ocp;

public class Manager extends Employee {

    public Manager(int salary, int bonus) {
        super.salary = salary;
        this.bonus = bonus;
    }

    private int bonus;
    @Override
    public int payAmount() {
        return salary + bonus;
    }
}
