package programmers;
import java.util.Scanner;

public class Solution6 {
    public int solution(int[] a, int[] b) {
        int answer=0;
        for(int i=0; i<a.length; i++) {
            answer+=(a[i]*b[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution6 s=new Solution6();
        int len=scan.nextInt(); //배열 길이
        int[] a=new int[len];
        int[] b=new int[len];
        for(int i=0; i<len; i++) {  //a 배열의 값 입력
            a[i]=scan.nextInt();
        }
        System.out.println();
        for(int i=0; i<len; i++) {  //b 배열의 값 입력
            b[i]=scan.nextInt();
        }
        System.out.println();
        System.out.println(s.solution(a,b));
    }
}