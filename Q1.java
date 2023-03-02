import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int ui = x.nextInt(), s = 0, p = 1;
		int tempu = ui;
		
		while (tempu > 0) {
			int no = tempu % 10;
			s += no;
			p *= no;
			tempu /= 10;
		}
		if (s == p) {
			System.out.println(ui + " is a spy number");
		}
		else {
			System.out.println(ui + " is not a spy number");
		}
	}
}
