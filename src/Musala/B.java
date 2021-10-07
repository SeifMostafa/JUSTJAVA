package Musala;

import java.io.IOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class B {
    // BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    public static List<String> funWithAnagrams(List<String> text) {
        List<String> result = new ArrayList<>();
        List<String> sortedCharsResult = new ArrayList<>();
        if (!text.isEmpty()) {


            result.add(text.get(0));

            char[] addedCharArr = text.get(0).toCharArray();
            Arrays.sort(addedCharArr);
            sortedCharsResult.add(String.valueOf(addedCharArr));
            for (String t : text) {
                char[] tCharArr = t.toCharArray();
                Arrays.sort(tCharArr);
                String sortedT = String.valueOf(tCharArr);

                if (!sortedCharsResult.contains(sortedT)) {
                    sortedCharsResult.add(sortedT);
                    result.add(t);
                }
            }

            Collections.sort(result);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int textCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> text = IntStream.range(0, textCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = B.funWithAnagrams(text);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
