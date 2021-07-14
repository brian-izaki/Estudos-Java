package ooPolimorfismo.interfaces;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[4];

        payableObjects[0] = new Invoice("01234", "cadeira", 2, 375.00);
        payableObjects[1] = new Invoice("59038", "pneu", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("Elton", "John", "111-11-1111", 800.00);
        payableObjects[3] = new SalariedEmployee("Lisa", "Simpson", "222-22-2222", 1200.00);

        System.out.println(
                "Fatura e empregados processados polimorficamente:");

        for(Payable currentPayable : payableObjects) {
            System.out.printf("%n%s %n%s: $%,.2f\n %s%n",
                    currentPayable.toString() ,
                    "payment due", currentPayable.getPaymentAmount(), currentPayable.getTesteDefault() );
        }
    }
}
