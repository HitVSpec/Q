import java.util.Scanner;
public class Q2 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the sentence: ");
		String ui = x.nextLine();
		
		System.out.print("Enter the word you want to check the frequency of: ");
		String uiw = x.nextLine();
		
		int f = 0;
		String[] words = ui.split(" ");
		for (String z : words) {
			if (z.equals(uiw)) {
				f++;
			}
		}
		System.out.println("The word " + uiw + " appears " + f + " times in the sentence");
	}
}
