package org.sigorjav.programmers.lessons12000;

import java.util.*;
import java.util.stream.*;
public class Lessons12933 {
    public static void main(String[] args){
        int n = 118372;
        String s = String.valueOf(n);
        String[] sArr = s.split("");

        long answer = 0;
        answer = Long.parseLong(Arrays.stream(sArr)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));

        System.out.println(answer);
    }
}
