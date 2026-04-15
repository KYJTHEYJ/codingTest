package problems.programmers;

public class solution21 {
    public boolean solution(int x) {
        boolean answer = true;

        char[] charNumbers = String.valueOf(x).toCharArray();

        int partNumberSum = 0;
        for(char charNumber : charNumbers) {
            int partNumber = Integer.parseInt(String.valueOf(charNumber));
            partNumberSum += partNumber;
        }

        if(x % partNumberSum != 0) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new solution21().solution(11));
    }
}
