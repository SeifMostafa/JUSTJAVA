package practicing;

import java.util.Scanner;

public class stdINstdOut_series {
    private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a ;
            for(int j=0;j<n-1;j++){
            	result +=Math.pow(2, j)*b;
            	System.out.print(result + " ");
            }
            result +=Math.pow(2, n-1)*b;
        	System.out.println(result);
        }
        in.close();
	}

}
