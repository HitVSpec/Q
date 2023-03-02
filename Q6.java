import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int ui = x.nextInt(), newNo = 0, sum = 0;
        int ogi = ui;

        while (ui > 0) {
            newNo = ui % 10;
            sum += factorial(newNo);
            ui /= 10;
        }
        if (ogi == sum) {
            System.out.println(ogi + " is a special number");
        }
        else {
            System.out.println(ogi + " is not a special number");
        }
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
