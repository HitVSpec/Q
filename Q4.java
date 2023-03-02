import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the Amount: ");
		int ui = x.nextInt();
		int r2k, r500, r100, r50, r20, r2, r5, r1;
        r2k = ui / 2000;
        ui %= 2000;

        r500 = ui / 500;
        ui %= 500;

        r100 = ui / 100;
        ui %= 100;

        r50 = ui / 50;
        ui %= 50;

        r20 = ui / 20;
        ui %= 20;

        r5 = ui / 5;
        ui %= 5;

        r2 = ui / 2;
        ui %= 2;

        r1 = ui;


        System.out.println("Notes required: ");
        System.out.println("Rs. 2000: " + r2k);
        System.out.println("Rs. 500: " + r500);
        System.out.println("Rs. 100: " + r100);
        System.out.println("Rs. 50: " + r50);
        System.out.println("Rs. 20: " + r20);
        System.out.println("Rs. 5: " + r5);
        System.out.println("Rs. 2: " + r2);
        System.out.println("Rs. 1: " + r1);
		}
	}
