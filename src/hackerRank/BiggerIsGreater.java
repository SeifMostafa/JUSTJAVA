package hackerRank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.stream.IntStream;

public class BiggerIsGreater {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, T).forEach(TItr -> {
			try {
				String w = bufferedReader.readLine();

				String result = BiggerIsGreater.biggerIsGreater(w);

				bufferedWriter.write(result);
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}

	public static String biggerIsGreater(String w) {
		// Write your code here
		int i = w.length() - 1;
		char pivot = '$';
		while (i > 0) {
			if (w.charAt(i) > w.charAt(i - 1)) {
				pivot = w.charAt(i - 1);
				break;
			}
			i--;
		}
		if (pivot == '$')
			return "no answer";
		char smallest = '~';
		for (int j = i ; j < w.length(); j++) {
			if (w.charAt(j) - pivot < smallest - pivot && w.charAt(j)>pivot)
				smallest = w.charAt(j);
		}
		String rev = new StringBuilder(w.substring(i)).reverse().toString().replaceFirst("" + smallest, "" + pivot);
		return w.substring(0, i - 1) + smallest + rev;

	}
}
