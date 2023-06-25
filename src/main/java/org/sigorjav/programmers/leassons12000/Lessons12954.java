package org.sigorjav.programmers.leassons12000;

import java.util.Arrays;

public class Lessons12954 {
    public static void main(String[] args) {
        int n = 5;
        int x = 2;
        long[] answer = new long[n];

        for(int i=0;i<n;i++){
            answer[i] = i > 0 ? answer[i-1] + x : x;
        }

        System.out.println(Arrays.toString(answer));
    }
}
