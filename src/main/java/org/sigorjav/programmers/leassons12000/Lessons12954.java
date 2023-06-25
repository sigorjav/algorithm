package org.sigorjav.programmers.leassons12000;

import java.util.Arrays;

public class Lessons12954 {
    public static void main(String[] args) {
        long n = 53241;
        String str = Long.toString(n);
        StringBuilder sb = new StringBuilder(str).reverse();
        String[] splitArr = sb.toString().split("");

        int[] answer = Arrays
                        .stream(splitArr)
                        .mapToInt(Integer::parseInt)
                        .toArray();
        System.out.println(Arrays.toString(answer));
    }
}
