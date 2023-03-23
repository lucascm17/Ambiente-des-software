import java.util.Scanner;

public class Soma {
	Scanner s = new Scanner((System.in));
	
	public void soma(int a) {
		double soma = 0;
		int numero;
		
		for (int i = 0; i < a; i++) {
			numero = s.nextInt();
			soma = soma + numero;
		}
		
		System.out.println("Soma: " + soma);
	}
}
