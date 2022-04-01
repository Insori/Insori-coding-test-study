package programmers;

import java.util.Scanner;

public class Solution2 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i=1; i<=n; i++) {
            answer[i-1]=x*i;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution2 s=new Solution2();
        long arr[]=s.solution(scan.nextInt(), scan.nextInt());
        System.out.print("[ ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
