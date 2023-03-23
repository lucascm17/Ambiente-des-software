import java.util.Scanner;

public class Contagem {

	Scanner sc = new Scanner(System.in);

	public void conta(int n) {
		int[] numeros = new int[n];
		int contador = 0;

		for (int index = 0; index < numeros.length; index++) {
			numeros[index] = sc.nextInt();
			if (numeros[index] % 1 == 0)
				contador++;
		}

		System.out.println("A quantidade de numeros inteiros eh: " + contador);
	}
}
