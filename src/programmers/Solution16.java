package programmers;
import java.util.Scanner;

public class Solution16 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min=arr[0];
        if(arr.length!=1) {
            answer=new int[arr.length-1];
            for(int i=1; i<arr.length; i++) {
                if(min>arr[i])
                    min=arr[i];
            }
            int k=0;
            for(int j=0; j<arr.length; j++) {
                if(min==arr[j])
                    continue;
                else
                    answer[k++]=arr[j];
            }
        }
        else {
            answer=new int[1];
            answer[0]=-1;
        }
        return answer;
    }
}