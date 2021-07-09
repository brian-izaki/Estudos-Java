package ooHeranca.comissionEmployee;

public class BasePlusComissionEmployee extends ComissionEmployee{
    private double baseSalary;

    public BasePlusComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale,
                              double comissionRate, double baseSalary) {
        // NÃO está sendo herdado, mas sim, invocando explicitamente
        super(firstName, lastName, socialSecurityNumber, grossSale, comissionRate);

        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Salário base deve ser maior ou igual a 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException("Salário base deve ser maior ou igual a 0.0");
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                super.toString(), "base salary", getBaseSalary());
    }
}
