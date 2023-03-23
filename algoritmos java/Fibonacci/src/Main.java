import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
Scanner s = new Scanner(System.in);
		
		System.out.println("Número de termos:");
		int n = s.nextInt();
        
        Fib fibonacci = new Fib();
        fibonacci.fib(n);
        
        s.close();
	}

}
