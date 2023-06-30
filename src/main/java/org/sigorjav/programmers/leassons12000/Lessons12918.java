package org.sigorjav.programmers.leassons12000;

public class Lessons12918 {
    public static void main(String[] args) {

        String s = "a23465";
        boolean answer = (s.length() == 4 || s.length() == 6) && s.matches("^[0-9]*$");

        System.out.println(answer);



    }
}
