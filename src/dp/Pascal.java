package dp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pascal {

	public static void main(String[] args) {
		Pascal pascal = new Pascal();
		pascal.buildPascalPyramid(10).forEach(list -> System.out.println(list));
		
	}

	List<List<Integer>> buildPascalPyramid(int n) {
		Integer[][] pyramid = new Integer[n][];
		for (int i = 1; i <= n; i++) {
			Integer[] row = new Integer[i];
			row[0] = 1;
			row[row.length - 1] = 1;

			for (int j = 1; j < i-1; j++) {
				row[j] = pyramid[i - 2][j-1] + pyramid[i - 2][j ];
			}
			pyramid[i-1] = row;
		}
		return Arrays.stream(pyramid).map(Arrays::asList).collect(Collectors.toList());
	}
}
