package ooHeranca.comissionEmployee;

public class ComissionEmployeeTest {
    public static void main(String[] args) {
        ComissionEmployee employee = new ComissionEmployee("Sue", "Jones",
                "222-22-2222", 10000, .06);

        System.out.println("Informações do empregado pego pelos métodos get:");
        System.out.printf("\n%s %s\n", "Primeiro nome é", employee.getFirstName());
        System.out.printf("%s %s\n", "Último nome é", employee.getLastName());
        System.out.printf("%s %s\n", "Número de seguro social é", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f\n", "Venda bruta é", employee.getGrossSale());
        System.out.printf("%s %.2f\n", "Taxa de comissão é", employee.getComissionRate());

        employee.setGrossSale(5000);
        employee.setComissionRate(.1);
        System.out.printf("\n%s: \n\n%s\n", "informações do empregado atualizadas", employee);
    }
}
