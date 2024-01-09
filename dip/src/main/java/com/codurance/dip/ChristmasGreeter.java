package com.codurance.dip;

public class ChristmasGreeter extends EmployeeGreeter
{
    private EmployeeRepository employeeRepository;
    public ChristmasGreeter(EmployeeRepository employeeRepository, Sender sender)
    {
        this.employeeRepository = employeeRepository;
        this.sender = sender;
    }

    public void sendGreetings() {
        sendGreetings(employeeRepository.findAll());
    }

    @Override
    public Email emailFor(Employee employee) {
        String message = String.format("Merry christmas, dear %s!", employee.getFirstName());
        return new Email(employee.getEmail(), "Merry christmas!", message);
    }
}
