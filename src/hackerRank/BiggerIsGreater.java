package hackerRank;

import java.util.Arrays;

public class BiggerIsGreater {

	public static void main(String[] args) {
		String w="abaccc";
		System.out.println(biggerIsGreater(w));
	}
	public static String biggerIsGreater(String w) {
		// Write your code here
		char[] chars = w.toCharArray();
		for(int i=w.length()-1;i>0;i--) {
			for (int j=i-1;j>=0;j--) {
				if (w.charAt(i) > w.charAt(j)) {
					chars[i] = chars[j];
					chars[j] = w.charAt(i);
					char [] chars1 = Arrays.copyOfRange(chars,j+1,chars.length);
					Arrays.sort(chars1);
					return String.valueOf(Arrays.copyOfRange(chars,0,j+1)) +String.valueOf(chars1);
				}
			}
		}
		return "no answer";
	}
}
