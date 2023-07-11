package org.sigorjav.programmers.lessons12000;

public class Lessons12943 {
    public static void main(String[] args) {
        Solution12943 s = new Solution12943();

        int answer = s.solution(626331);
        System.out.println(answer);
    }
}

class Solution12943 {
    // 문제에서 제시하는 num은 int 이지만 계산 중에 int의 범위를 벗어나게 된다.
    // 자료형의 범위도 항상 생각해서 코딩을 해야하는 큰 배움을 얻었다.

    // 해석: solution 함수의 값이 626331(케이스 3)인 경우, 계산 중에 int 자료형의 범위를 초과하게 됩니다.
    //      따라서 488이 나와 버리는 현상이 있었다.
    public int solution(long num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        int count = 0;
        int answer = recursive(num, count);
        return answer;
    }

    public static int recursive(long num, int count) {
        long temp = num % 2 == 0 ? num / 2 : (num * 3) + 1;

        count++;
        if (temp == 1) {
            return count;
        } else if (count > 500) {
            return -1;
        }

        return recursive(temp, count);
    }
}