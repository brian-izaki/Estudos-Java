package ooPolimorfismo.employees;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hour) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0)
            throw new IllegalArgumentException("salário por hora deve ser maior ou igual a 0.0");

        if (hour < 0 || hour > 168.0)
            throw new IllegalArgumentException("Horas trabalhadas devem estar entre 0.0 e 168.0 horas");

        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0)
            throw new IllegalArgumentException("salário por hora deve ser maior ou igual a 0.0");
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        if (hour < 0 || hour > 168.0)
            throw new IllegalArgumentException("Horas trabalhadas devem estar entre 0.0 e 168.0 horas");
        this.hour = hour;
    }

    @Override
    public double earnings() {
        if (getHour() <= 40)
            return getWage() * getHour();
        else
            return 40 * getWage() + (getHour() - 40) * getWage() * 1.5;
    }

    @Override
    public String toString() {
        return String.format("Empregado por hora: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "Salário por hora", getWage(), "Horas trabalhadas", getHour());
    }
}
