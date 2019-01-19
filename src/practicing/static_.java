package practicing;

import java.util.Scanner;

public class static_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		short b,h;
		 b=sc.nextShort();
		 h=sc.nextShort();
			if(b>0&&h>0) System.out.println(b*h);
			else System.out.println("java.lang.Exception: Breadth and height must be positive");
		 sc.close();
	}

}
