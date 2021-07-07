package classes_objetos_exame_mais_profundo.classeStatic;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.printf("Employees antes da instanciação: %d\n", Employee.getCount());

        Employee e1 = new Employee("Susan", "Baker");
        Employee e2 = new Employee("Bob", "Blue");

        System.out.print("\nEmployees depois da instanciação\n");
        System.out.printf("via e1.getCount(): %d\n", e1.getCount());
        System.out.printf("via e2.getCount(): %d\n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d\n", Employee.getCount());

        System.out.printf("Employee 1: %s %s\nEmployee 2: %s %s", e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());

    }
}
