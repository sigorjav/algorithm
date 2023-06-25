package org.sigorjav.programmers.lessons120956;

public class Lessons120956 {
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        int answer = 0;

        for (String s : babbling) {
            char[] chars = s.toCharArray();
            String str = "";

            for (int j = 0; j < chars.length; j++) {
                str += chars[j];
                if (str.length() % 2 == 0) {
                    if (str.equals("ye") || str.equals("ma")) {
                        str = "";
                    }
                } else if (str.length() % 3 == 0) {
                    if (str.equals("aya") || str.equals("woo")) {
                        str = "";
                    }
                }
                if (str.equals("") && j == chars.length - 1) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
