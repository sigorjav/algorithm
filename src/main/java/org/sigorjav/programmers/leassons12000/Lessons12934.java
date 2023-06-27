package org.sigorjav.programmers.leassons12000;

public class Lessons12934 {
    public static void main(String[] args) {
//        int price = 2_500;
//        int money = 1_000_000_000;
//        int count = 2_500;

        // 내 풀이
//        long temp = 0;
//        for(int i=1; i<count+1;i++){
//            temp += i > 1 ? price * i : price;
//        }
//        answer = money - temp;
//        answer = answer > 0 ? 0 : Math.abs(answer);

        // 맘에 들었던 답안
        // max를 사용하면 삼항연산자의 비교를 하지 않을 수 있다.
        // max 메소드 안에 들어가보면 안에서 삼항연산자를 사용하고있다.
        long price = 2_500;
        long money = 1_000_000_000;
        long count = 2_500;
        long answer = -1;
        // 모든 인자의 타입을 long 으로 변경해서 아래 코드를 한줄로 끝낼 수 있다.
        answer = Math.max(price * (count * (count + 1) / 2) - money, 0);

        System.out.println(answer);
    }
}
