package ooPolimorfismo.employees;

public class CommissionEmployee extends Employee{
    private double grossSale;
    private double commissionRate;


    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale,
                              double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Porcentagem da comissão deve estar entre 0.0 e 1.0");

        if(grossSale < 0.0)
            throw new IllegalArgumentException("Venda bruta deve ser maior ou igual a 0.0");

        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        if(grossSale < 0.0)
            throw new IllegalArgumentException("Venda bruta deve ser maior ou igual a 0.0");
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Porcentagem da comissão deve estar entre 0.0 e 1.0");
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSale();
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "empregado comissionado", super.toString(),
                "venda Bruta", getGrossSale(),
                "Porcentagem de comissão", getCommissionRate());
    }
}
