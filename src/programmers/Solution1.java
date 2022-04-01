package programmers;

import java.util.Scanner;

public class Solution1 {
    String answer1 = "Even";
    String answer2 = "Odd";

    public String solution(int num) {
        if(num%2==0)
            return answer1;
        else
            return answer2;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution1 s=new Solution1();
        System.out.println(s.solution(scan.nextInt()));
        System.out.println(s.solution(scan.nextInt()));
    }
}