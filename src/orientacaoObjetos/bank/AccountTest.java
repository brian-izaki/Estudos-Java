package orientacaoObjetos.bank;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		
		Account myAccount1 = new Account("brian", 50.00);
		Account myAccount2 = new Account("Larissa", -4.00);
		
		displayAccount(myAccount1);
		displayAccount(myAccount2);		
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nDigite o valor que irá depositar na conta 1: ");
		double depositAmount = input.nextDouble();
		
		myAccount1.deposit(depositAmount);
		
		displayAccount(myAccount1);
		displayAccount(myAccount2);
		
		System.out.print("\nDigite o valor que irá depositar na conta 2: ");
		depositAmount = input.nextDouble();
		myAccount2.deposit(depositAmount);
		
		displayAccount(myAccount1);
		displayAccount(myAccount2);
		
		
		//System.out.print("Digite o nome da nova conta: ");
		//String theName = input.nextLine(); // lê uma linha de texto
		//myAccount.setName(theName);
		
		//System.out.printf("\nNome na nova conta: %s\n", myAccount.getName());
	}
	
	public static void displayAccount(Account account) {
		System.out.printf("%s possui saldo atual de: R$ %.2f\n", 
				account.getName(), account.getBalance());
	}
}
