package programmers;

import java.util.*;

public class Solution28 {
    public int[] solution(int []arr) {

        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        int su = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=su) {
                arrlist.add(arr[i]);
                su = arr[i];
            }
        }

        int[] answer = new int[arrlist.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = arrlist.get(i);
        }
        return answer;
    }
}