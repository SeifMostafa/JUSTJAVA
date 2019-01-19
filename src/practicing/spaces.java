package practicing;

import java.util.Scanner;

public class spaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s;
        int count= 1;
        s = sc.nextLine();
    	System.out.println("" + count++ +" "  +s);
        while(sc.hasNext()){
        	s = sc.nextLine();
        	System.out.println("" + count++ +" "  +s);
        }
        sc.close();
	}

}
