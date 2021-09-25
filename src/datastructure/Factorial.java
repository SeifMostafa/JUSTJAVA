package datastructure;

public class Factorial {

	public static void main(String[] args) {
		System.out.print(fact(5));

	}

	private static int fact(int i) {
		if(i<=1)  return 1; else return fact(i-1)*i;
	}

}
