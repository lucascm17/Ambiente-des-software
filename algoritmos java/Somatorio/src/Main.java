import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Quantidade de numeros: ");
		int a = s.nextInt();
		
		Soma soma = new Soma();
		soma.soma(a);
		
		s.close();
	}

}
