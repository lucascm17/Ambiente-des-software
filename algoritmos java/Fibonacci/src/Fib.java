
public class Fib {
	
	public void fib(int n) {
        int a = 0;
		int b = 1;
		int i = 2;
		int c;

		if (n == 1) {
		    System.out.print(a);
		} else {
		    System.out.print(a + " " + b);
		}

		while (i < n) {
			i = i + 1;
		    c = a + b;
		    System.out.print(", " + c);
		    a = b;
		    b = c;
		}
    }
}
