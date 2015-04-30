
public class CalculaterDriver {

	public static void main(String [] args) {
		//instantiating the int and double arrays
		int [] intNum = {1, 3, 6, 10, 15};
		double [] doubleNum = {1.1, 3.3, 6.6, 11.0, 16.5};
		//testing each method from the Calculator class
		System.out.println("Sum of Integer: " + Calculater.sum(intNum));
		System.out.println("Sum of Double: " + Calculater.sum(doubleNum));
		System.out.println("Average of Integer: " + Calculater.average(intNum));
		System.out.println("Average of Double: " + Calculater.average(doubleNum));
		System.out.println("Product of Integer: " + Calculater.product(intNum));
		System.out.println("Product of Double: " + Calculater.product(doubleNum));
		System.out.println("Factorials of Integer:");
		Calculater.factorial(intNum);
	}
}