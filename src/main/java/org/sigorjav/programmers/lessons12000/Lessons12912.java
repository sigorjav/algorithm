package org.sigorjav.programmers.lessons12000;

public class Lessons12912 {
    public static void main(String[] args) {
        Solution12912 s = new Solution12912();
        long answer = s.solution(5,3);

        System.out.println(answer);
    }
}
class Solution12912 {
    public long solution(int a, int b) {
        long answer = 0;

        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }

        for(int i=a;a<=b;a++){
            answer += a;
        }

        return answer;
    }
}