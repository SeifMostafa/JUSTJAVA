package Musala;

import hackerRank.TheTimeinWords;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class A {
   // BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int maxStreak(int m, List<String> data) {
        int max=0;
        int localMax=0;
        // loop data and compare with max for all employees attended
        for(String day:data){

            if(day.contains("N")){
                if(localMax>max) {
                    max=localMax;
                }
                localMax=0;
            }else{
                localMax+=1;
            }
        }

        if(localMax>max)max=localMax;
        return max;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        int dataCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> data = IntStream.range(0, dataCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        int result = A.maxStreak(m, data);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
