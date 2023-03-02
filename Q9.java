import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int a = x.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int b = x.nextInt();

        int LCM = (a * b) / gcd(a, b);
        System.out.println("LCM of " + a +" and " + b + " is " + LCM);
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
