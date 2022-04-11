package programmers;
import java.util.Scanner;

public class Solution11 {
    public int solution(int[] nums) {
        int answer = 0;
        int sum=0;
        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    sum=(nums[i]+nums[j]+nums[k]);
                    int cnt=0;
                    for(int o=2; o<sum; o++) {
                        if(sum%o==0) {
                            cnt++;
                        }
                    }
                    if(cnt==0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Solution11 s = new Solution11();
        int len=scan.nextInt(); //배열 길이 - 3 이상 50 이하
        int[] nums=new int[len];
        for(int i=0; i< nums.length; i++) {
            nums[i]= scan.nextInt();
        }
        System.out.print(s.solution(nums));
    }
}