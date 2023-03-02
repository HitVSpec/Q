import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the value of x in e^x: ");
		double ui = x.nextDouble();
		int n = 10000;
		double ex = 1.0;
		double term = 1.0;

		for (int i = 1; i <= n; i++) {
		    term *= ui / i;
		    ex += term;
		}
		System.out.println(ex);
		}
	}