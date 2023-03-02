import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
		Scanner x =  new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int ui = x.nextInt();
		int[] A = new int[ui];
		  System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < ui; i++) {
	            A[i] = x.nextInt();
	        }
	        for (int i = 0; i < ui - 1;) {
	            if(A[i] + 1 == A[i+1]) {
			    int temp = A[i];
			    A[i] = A[i + 1];
			    A[i + 1] = temp;
			    i += 2;
		    }
	            else {
	            	i += 1;
	            }
		}
	        System.out.println("The array after swapping consecutive elements:");
	        for (int i = 0; i < ui; i++) {
	            System.out.print(A[i] + " ");
	            }
	}
}
