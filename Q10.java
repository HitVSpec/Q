import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int a = x.nextInt();
        System.out.print("Enter the upper limit: ");
        int b = x.nextInt();
        int o = 0, e = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                e++;
            }
            else {
                o++;
            }
        }
        System.out.println("Number of Odd numbers are " + o + " and number of Even numbers are " + e);
    }
}
