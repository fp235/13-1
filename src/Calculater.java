
public class Calculater {

	public static double sum(double [] num) {
		double sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	public static int sum(int [] num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	public static double average(double [] num) {
		double sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum / num.length;
	}
	
	public static int average(int [] num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum / num.length;
	}
	
	public static double product(double [] num) {
		double product = 1;
		for(int i = 0; i < num.length; i++) {
			product *= num[i];
		}
		return product;
	}
	
	public static int product(int [] num) {
		int product = 1;
		for(int i = 0; i < num.length; i++) {
			product *= num[i];
		}
		return product;
	}

	public static void factorial(int [] num) {
		long product = 1; 
		for(int i = 0; i < num.length; i++) {
			for(int j = num[i]; j > 0; j--) {
				product *= j;
			}
			System.out.println(num[i] + "! = " + product);
			product = 1;
		}
	}
}
