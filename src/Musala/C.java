package Musala;

import java.io.IOException;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class C {

    public static int maxSubsequenceLength(int k, List<Integer> arr) {
        int maxSeq = 1;
        int localMax = 1;
        for (int i = 0; i < arr.size() - 1; i++) {
            int r = arr.get(i).intValue() ^ arr.get(i + 1).intValue();
            if (r == k || r%k==0) {
                localMax += 1;
            } else {
                if (localMax > maxSeq) {
                    maxSeq = localMax;
                }
                localMax = 1;
            }
        }

        if (localMax > maxSeq) maxSeq = localMax;
        return maxSeq;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = C.maxSubsequenceLength(k, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
