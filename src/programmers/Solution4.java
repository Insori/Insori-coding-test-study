package programmers;

public class Solution4 {
    public char[] solution(char[] phone_number) {
        for(int i=0; i< phone_number.length-4; i++) {
            phone_number[i]='*';
        }
        return phone_number;
    }

    public static void main(String[] args) {
        Solution4 s=new Solution4();
        char[] num1={'0','1','0','3','3','3','3','4','4','4','4'};
        char[] num2={'0','2','7','7','7','8','8','8','8'};
        for(int i=0; i< num1.length; i++) {
            System.out.print(num1[i]);
        }
        System.out.println();
        s.solution(num1);
        for(int i=0; i< num1.length; i++) {
            System.out.print(num1[i]);
        }

        System.out.println();
        for(int i=0; i< num2.length; i++) {
            System.out.print(num2[i]);
        }
        System.out.println();
        s.solution(num2);
        for(int i=0; i< num2.length; i++) {
            System.out.print(num2[i]);
        }
    }
}