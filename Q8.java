import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int ui = x.nextInt();

        for (int i = 2; i <= ui; i++) {
                while (ui % i == 0) {
                    System.out.print(i + " ");
                    ui /= i;
                }
        }
    }
}
