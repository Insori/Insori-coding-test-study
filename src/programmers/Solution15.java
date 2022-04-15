package programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution15 {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};  //수포자1
        int[] b = {2,1,2,3,2,4,2,5};    //수포자2
        int[] c = {3,3,1,1,2,2,4,4,5,5};    //수포자3

        int a_cnt=0;
        int b_cnt=0;
        int c_cnt=0;

        for(int i=0; i<answers.length; i++) {
            if(a[i%a.length]==answers[i])
                a_cnt++;
            if(b[i%b.length]==answers[i])
                b_cnt++;
            if(c[i%c.length]==answers[i])
                c_cnt++;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        int max=Math.max(a_cnt,Math.max(b_cnt,c_cnt));

        if(max==a_cnt)
            arr.add(1);
        if(max==b_cnt)
            arr.add(2);
        if(max==c_cnt)
            arr.add(3);

        int[] answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i]=arr.get(i);
        }
        return answer;
    }
}
