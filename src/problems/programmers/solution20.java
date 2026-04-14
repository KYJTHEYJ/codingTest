package problems.programmers;

import java.util.Arrays;

public class solution20 {
    public long solution(long n) {
        String strNumber = String.valueOf(n);
        char[] charNumbers = strNumber.toCharArray();
        Arrays.sort(charNumbers);

        StringBuilder stringBuilder = new StringBuilder();
        for(char charNumber : charNumbers) {
            stringBuilder.append(charNumber);
        }

        String newNumberStr = String.valueOf(stringBuilder.reverse());

        return Long.parseLong(newNumberStr);
    }

    public static void main(String[] args) {
        System.out.println(new solution20().solution(118372));
    }
}
