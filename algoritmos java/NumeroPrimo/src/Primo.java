import java.util.Scanner;
public class Primo {
	
	 Scanner sc = new Scanner(System.in);

	    public void verifica_primo(int N) {
	        int X;
	        int contador;

	        for (int i = 0; i < N; i++) {
	        	contador = 0;
	        	X = sc.nextInt();

	        	for (int j = 2; j < X; j++) {
	        		if (X % j == 0) {
	                    contador++;
	                }
	        	}

	        	if (contador == 0) {
	                System.out.println(X + " eh primo");
	            }
	        	else {
	                System.out.println(X + " nao eh primo");
	            }
	        }
	    }
}
