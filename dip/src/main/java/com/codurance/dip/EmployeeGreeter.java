package com.codurance.dip;

import java.util.List;

public abstract class EmployeeGreeter implements Greeter
{
    protected Sender sender;

    protected void sendGreetings(List<Employee> employees)
    {
        employees.stream()
                .map(employee -> emailFor(employee))
                .forEach(email -> sender.send(email));
    }
}
