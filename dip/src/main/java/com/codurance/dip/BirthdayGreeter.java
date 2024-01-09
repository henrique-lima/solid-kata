package com.codurance.dip;

import java.time.MonthDay;

public class BirthdayGreeter extends EmployeeGreeter {
    private EmployeeRepository employeeRepository;
    private final Clock clock;

    public BirthdayGreeter(EmployeeRepository employeeRepository, Clock clock, Sender sender) {
        this.employeeRepository = employeeRepository;
        this.clock = clock;
        this.sender = sender;
    }

    public void sendGreetings() {
        MonthDay today = clock.monthDay();
        sendGreetings(employeeRepository.findEmployeesBornOn(today));
    }

    public Email emailFor(Employee employee) {
        String message = String.format("Happy birthday, dear %s!", employee.getFirstName());
        return new Email(employee.getEmail(), "Happy birthday!", message);
    }
}