package org.sigorjav.programmers.lessons150000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Lessons150370 {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        String[] dates = today.split("\\.");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);

        HashMap<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] temp = term.split(" ");
            termsMap.put(temp[0], Integer.parseInt(temp[1]));
        }

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i=0; i<privacies.length;i++) {
            String[] privacyTemp = privacies[i].split(" ");
            String[] dTemp = privacyTemp[0].split("\\.");
            int y = Integer.parseInt(dTemp[0]);
            int m = Integer.parseInt(dTemp[1]);
            int d = Integer.parseInt(dTemp[2]);

            int termsMonth = termsMap.get(privacyTemp[1]);

            // 년도가 크면 무조건 12를 더한다.
            int monthTemp = 12 * (year - y);
            // month를 계산하여 년도에 월을 더한다.
            monthTemp += month - m;
            // 날짜를 빼서 0보다 크면 1달을 더한다.
            if (day < d) {
                monthTemp -= 1;
            }

            // 계산된 월이 약관 기한보다 크면 지난것으로 패기한다.
            if (monthTemp >= termsMonth) {
                answer.add(i + 1);
            }

        }

        System.out.println(Arrays.toString(answer.stream().mapToInt(integer -> integer).toArray()));
    }

}
