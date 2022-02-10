	import java.util.*;
	public class q1ArithemeticException {
	    public static void main(String[] args)
	    {
	    Scanner sc= new Scanner(System.in);
	        int a =sc.nextInt();
	        int b =sc.nextInt();
	        try {
	            System.out.println(a / b); // throw Exception
	        }
	        catch (ArithmeticException e) {
	            // Exception handler
	            System.out.println(
	                "Divided by zero operation cannot possible");
	        }
	    }
	}


