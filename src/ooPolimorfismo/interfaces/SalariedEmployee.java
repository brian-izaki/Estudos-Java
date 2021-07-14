package ooPolimorfismo.interfaces;

import ooPolimorfismo.interfaces.Employee;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Salario semanal deve ser maior ou igual a 0.0");

        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException("Salario semanal deve ser maior ou igual a 0.0");
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("Empregado assalariado: %s\n%s: $%.2f", super.toString(), "Salário semanal",
                getWeeklySalary());
    }

    @Override
    public double getPaymentAmount() {
        return getWeeklySalary();
    }
}
