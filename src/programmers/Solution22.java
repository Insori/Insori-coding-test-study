package programmers;

public class Solution22 {
    public String solution(int a, int b) {
        String[] month = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        for(int i = 0; i < a - 1; i++) {
            sum += day[i];
        }

        sum += b-1;

        return month[sum%7];
    }
}