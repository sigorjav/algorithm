package org.sigorjav.programmers.leassons12000;

public class Lessons12934 {
    public static void main(String[] args) {
        int n = 123;
        String[] strInt = Integer.toString(n).split("");

        int answer = 0;
        // split으로 푸는 방법
//        for (String s : strInt) {
//            answer += Integer.parseInt(s);
//        }
        // 나누기로 푸는 방법
        // 10씩 나눠서 1의 자리수부터 나머지를 구하고 이를 더하면
        // 자릿수 별로 나눠서 구할 수 있다.
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        System.out.println(answer);



    }
}
