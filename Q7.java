public class Q7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 20; i += 2) {
            if (i % 4 == 0) {
                sum -= i;
            }
            else {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}