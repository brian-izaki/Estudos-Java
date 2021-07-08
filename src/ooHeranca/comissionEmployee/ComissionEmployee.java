package ooHeranca.comissionEmployee;

import java.math.BigDecimal;

public class ComissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSale;
    private double comissionRate;

    ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double comissionRate) {
        if (grossSale < 0.0)
            throw new IllegalArgumentException("Venda bruta deve ser maior ou igual a 0.0");

        if (comissionRate <= 0.0 || comissionRate >= 1.0)
            throw new IllegalArgumentException("Taxa da comissão deve ser maior que 0.0 e menor que 1.0");

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSale = grossSale;
        this.comissionRate = comissionRate;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        if (grossSale < 0.0)
            throw new IllegalArgumentException("Venda bruta deve ser maior que 0.0");
        this.grossSale = grossSale;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        if (comissionRate <= 0.0 || comissionRate >= 1.0)
            throw new IllegalArgumentException("Taxa da comissão deve ser maior que 0.0 e menor que 1.0");
        this.comissionRate = comissionRate;
    }

    public double earnings() {
        return getComissionRate() * getGrossSale();
    }

    public String toString() {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "comissão do empregado", getFirstName(), getLastName(),
                "número do seguro social", getSocialSecurityNumber(),
                "venda bruta", getGrossSale(),
                "taxa da comissão", getComissionRate());
    }
}
