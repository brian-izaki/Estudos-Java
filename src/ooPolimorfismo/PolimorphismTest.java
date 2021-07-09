package ooPolimorfismo;

import ooHeranca.comissionEmployee.BasePlusComissionEmployee;
import ooHeranca.comissionEmployee.ComissionEmployee;

public class PolimorphismTest {
    public static void main(String[] args) {
        ComissionEmployee comissionEmployee = new ComissionEmployee("Elen", "Iara",
                "333-44-33333", 1000, .06);

        BasePlusComissionEmployee basePlusComissionEmployee = new BasePlusComissionEmployee("Jorge",
                "Heiti", "555-55=5555", 5000, .04, 300);

        System.out.printf("%s %s: \n\n%s\n\n", "chama ComissionEmployee toString com referencia a superclasse",
                "para objeto superclasse", comissionEmployee);

        System.out.printf("%s %s: \n\n%s\n\n", "chama BasePlusComissionEmployee toString com referencia a subclasse",
                "para objeto subclasse", basePlusComissionEmployee);

        // !! Subclasse sendo atribuída a uma superclasse !!
        ComissionEmployee comissionEmployee2 = basePlusComissionEmployee;

        System.out.printf("%s %s: \n\n%s\n\n", "chama BasePlusComissionEmployee toString com referencia a superclasse",
                "para objeto subclasse", comissionEmployee2);
    }
}
