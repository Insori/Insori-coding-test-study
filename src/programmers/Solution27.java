package programmers;

import java.util.Arrays;

public class Solution27 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) count++;
        }
        if(count==0) {
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[count];
        int cnt = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) {
                answer[cnt] = arr[i];
                cnt++;
            }
            else continue;
        }
        Arrays.sort(answer);
        return answer;
    }
}