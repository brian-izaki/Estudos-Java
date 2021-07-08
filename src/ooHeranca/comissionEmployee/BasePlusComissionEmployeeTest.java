package ooHeranca.comissionEmployee;

public class BasePlusComissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusComissionEmployee employee = new BasePlusComissionEmployee("Sue", "Jones",
                "222-22-2222", 10000, .06, 300);

        System.out.println("Informações do empregado pego pelos métodos get:");
        System.out.printf("\n%s %s\n", "Primeiro nome é", employee.getFirstName());
        System.out.printf("%s %s\n", "Último nome é", employee.getLastName());
        System.out.printf("%s %s\n", "Número de seguro social é", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Venda bruta é", employee.getGrossSale());
        System.out.printf("%s %.2f\n", "Taxa de comissão é", employee.getComissionRate());
        System.out.printf("%s %.2f\n", "Salário base é", employee.getBaseSalary());

        employee.setBaseSalary(1000);
        System.out.printf("\n%s: \n\n%s\n", "informações do empregado atualizadas", employee);
    }
}
