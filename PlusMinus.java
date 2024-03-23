import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroNumbers = 0;
        
        for (Integer x : arr) {
            if (x < 0) {
                negativeNumbers++;
            } else if (x > 0) {
                positiveNumbers++;
            } else {
                zeroNumbers++;
            }
        }
        
        int numberOfElements = arr.size();
        float positiveRatio = (float) positiveNumbers / numberOfElements;
        float negativeRatio = (float) negativeNumbers / numberOfElements;
        float zeroRatio = (float) zeroNumbers / numberOfElements;
        
        System.out.println(String.format("%.6f", positiveRatio));
        System.out.println(String.format("%.6f", negativeRatio));
        System.out.println(String.format("%.6f", zeroRatio));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
