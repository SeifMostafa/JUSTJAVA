package hackerRank;

import java.io.*;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TheTimeinWords {
    ///https://stackoverflow.com/questions/3911966/how-to-convert-number-to-words-in-java
    private static final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private static String convertLessThanOneThousand(int number) {
        String soFar;

        if (number % 100 < 20) {
            soFar = numNames[number % 100];
            number /= 100;
        } else {
            soFar = numNames[number % 10];
            number /= 10;

            soFar = tensNames[number % 10] + soFar;
            number /= 10;
        }
        if (number == 0) return soFar;
        return numNames[number] + " hundred" + soFar;
    }

    public static String timeInWords(int h, int m) {
        // Write your code here
        StringBuilder stringBuilder = new StringBuilder();

        if ((m < 30) && m != 15 && m != 0 && m != 1)
            stringBuilder.append(convertLessThanOneThousand(m) + " minutes past");
        else if (m == 1)
            stringBuilder.append(convertLessThanOneThousand(m) + " minute past");
        else if (m == 15)
            stringBuilder.append("quarter past");
        else if (m == 30)
            stringBuilder.append("half past");
        else if (m == 45)
            stringBuilder.append("quarter to");
        else if (m > 30 && m != 59)
            stringBuilder.append(convertLessThanOneThousand(60 - m) + " minutes to");
        else if (m == 59)
            stringBuilder.append(convertLessThanOneThousand(60 - m) + " minute to");
        else
            stringBuilder.append("o' clock");

        if (m == 0) {
            stringBuilder.insert(0, convertLessThanOneThousand(h) + " ");
        } else if (m > 30) {
            stringBuilder.append(convertLessThanOneThousand(h + 1));
        } else {
            stringBuilder.append(convertLessThanOneThousand(h));

        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = TheTimeinWords.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
