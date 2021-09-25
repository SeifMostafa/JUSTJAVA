package C;

import java.util.Scanner;

public class JohnKatyaNoNuts {

	public static void main(String[] args) {
//question is the number 𝑎
		// answer to the question will be 𝑏

		Scanner scanner = new Scanner(System.in);
		int correctAns = scanner.nextInt();
		int theirAns = scanner.nextInt();
		if (correctAns > theirAns && theirAns != 0) {
			System.out.print(0);
		} else if (correctAns < theirAns && theirAns != 1000000000) {		
				System.out.print(theirAns + 1);
		} else {
			System.out.print(-1);
		}
		scanner.close();
	}

}
