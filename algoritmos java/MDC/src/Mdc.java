
public class Mdc {
	
	 public void calculaMDC(int a, int b) {
	        int resto;
	        
	        while (b != 0) {
	            resto = a % b;
	            a = b;
	            b = resto;
	        }

	        System.out.println("MDC = " + a);
	    }
}
