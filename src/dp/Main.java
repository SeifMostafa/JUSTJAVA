package dp;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		Main main = new Main();
		// main.countBits(2);
		System.out.print(main.fib(3));
	}

	public int[] countBits(int n) {
		int[] result = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			result[i] = 0;
			int num = i;
			while (num > 0) {
				if (num % 2 == 1)
					result[i]++;
				num = num / 2;
			}
		}
		return result;
	}

	public int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 2) + fib(n - 1);
	}
	
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=1;i<=numRows;i++){
            List<Integer> localRow = new List<Integer>();
            
        }
        return result;
    }	
	
	
}
