package entradaSaida.saidaDeDados;

import javax.swing.JOptionPane;

public class welcome {
	public static void main (String[] args) {
		System.out.println("Welcome to Java");
		
		System.out.print("adicionando novo texto");
		System.out.println("texto a mais");
		
		System.out.printf("%s %s %f", "teste", "formatado", 21.54);
		
		JOptionPane.showMessageDialog(null, "Welcome to Java with Swing");
	}
}
