package B;

import java.util.Scanner;

public class JohnKatya {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int typesOfNuts = scanner.nextInt();
		switch (typesOfNuts) {
		case 1:
			System.out.print("Win");
			break;
		case 2:
			System.out.print("Draw");
			break;
		default:
			System.out.print("Lose");
			break;
		}

	}

}
