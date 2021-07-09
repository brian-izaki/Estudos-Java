package ooPolimorfismo.employees;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Kobayashi", "san",
                "111-11-1111", 800);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Helen", "Santos",
                "222-22-2222", 16.75, 40);

        CommissionEmployee commissionEmployee = new CommissionEmployee("Zenebes", "Zuirá",
                "333-33-3333", 10000, .06);

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Larissa",
                "Lontrinha", "444-44-4444", 5000, .04, 300);

        System.out.println("Empregados processados individualmente:");

        System.out.printf("\n%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

        // aplicando polimorfismo
        // os quatro elementos a serem inseridos são subclasses de employee explicitamente ou implicitamente.
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.print("Empregados processados polimorficamente: \n\n");

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            // realiza verificação pois BasePlusCommissionEmployee será modificado em tempo de execução
            // instanceof determina se é um tipo em particular
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                // dowcast da referência de Employee para referência a BasePlusCommissionEmployee
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Novo salário base com 10%% aumentado é: $%,.2f\n", employee.getBaseSalary());
            }

            //
            System.out.printf("Ganhado $%,.2f\n\n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++)
            System.out.printf("Empregado %d é um %s\n", j, employees[j].getClass().getSimpleName());
    }
}
