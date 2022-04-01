package programmers;

import java.util.Scanner;

public class Solution3 {
    public double solution(int[] arr) {
        double answer = 0;
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
        }
        answer=(double)sum/arr.length;
        return answer;
    }

    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        Solution3 s=new Solution3();
        System.out.print("배열 길이: ");
        int len=scan.nextInt();
        int[] arr=new int[len];
        for(int i=0; i<arr.length; i++) {
            arr[i]=scan.nextInt();  //arr 입력
        }
        System.out.println(s.solution(arr));
    }
}
