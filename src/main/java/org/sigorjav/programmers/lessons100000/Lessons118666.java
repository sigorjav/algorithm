package org.sigorjav.programmers.lessons100000;

import java.util.HashMap;

/**
 * 배운점
 * 1. 반복 적인 패턴이 많아지면 배열로 값들을 묶어놓고 반복문으로 구현할 수 있는지 생각해볼 필요가 있다.
 * 2. HashMap을 사용하면 특정 인덱스의 값을 계속해서 갱신할 수 있다.
 * 3. 지표를 계산할 때 반복문에 +2씩 연산을 함으로써 지표에 대한 값을 처리할 수 있음을 배웠다.
 *    반복문을 반드시 1씩 증가시킬 필요는 없다.
 */
public class Lessons118666 {
    public static void main(String[] args) {
        HashMap<Character, Integer> typeMap = new HashMap<>();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA", "TR", "RT", "TR"};
//        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {5, 3, 2, 7, 5, 7, 3, 1};
//        int[] choices = {7, 3, 1};

        // index 1부터 점수가 사용되기 때문에 0번째는 -1로 초기화 한다.
        int[] score = {-1, 3, 2, 1, 0, 1, 2, 3};
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};

        for (char type : types) {
            typeMap.put(type, 0);
        }

        for (int i = 0; i < survey.length; i++) {
            int pos = 0;
            if (choices[i] >= 5) pos = 1;
            //
            typeMap.put(survey[i].charAt(pos), typeMap.get(survey[i].charAt(pos)) + score[choices[i]]);
        }

        StringBuilder answer = new StringBuilder();
        // 두개씩 건너뛰면 한번에 지표에 해당하는 타입을 모두 연산할 수 있다.
        for (int i = 0; i < types.length; i += 2) {
            answer.append(typeMap.get(types[i]) >= typeMap.get(types[i + 1]) ? types[i] : types[i + 1]);
        }

        System.out.println(answer.toString());

    }


}


