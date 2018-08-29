
public class Method {

	
	public double div(int a, int b) {
		
		try {
			return  a/b;
		}
		catch(ArithmeticException c){
			System.out.println(c.toString());
			System.out.println("Invalid input, returning zero");
			return 0;
		}
		}
}
