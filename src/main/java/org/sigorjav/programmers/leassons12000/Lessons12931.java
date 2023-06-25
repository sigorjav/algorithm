package org.sigorjav.programmers.leassons12000;

public class Lessons12931 {
    public static void main(String[] args) {
        int n = 123;
        String[] strInt = Integer.toString(n).split("");

        int answer = 0;
        // split으로 푸는 방법
//        for (String s : strInt) {
//            answer += Integer.parseInt(s);
//        }
        // 나누기로 푸는 방법
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        System.out.println(answer);



    }
}
