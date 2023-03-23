import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Digite um numero: ");
	        int a = sc.nextInt();

	        System.out.println("Digite um numero: ");
	        int b = sc.nextInt();

	        Mdc mdc = new Mdc();
	        mdc.calculaMDC(a, b);
	        
	        sc.close();
	}

}
