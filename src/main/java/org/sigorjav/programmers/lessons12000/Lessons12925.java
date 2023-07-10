package org.sigorjav.programmers.lessons12000;
public class Lessons12925 {
    public static void main(String[] args){
        int answer = 0;
        String s = "-1234";

        if('-' == s.charAt(0)){
            answer = Integer.parseInt("-"+s.substring(1));
        } else {
            answer = Integer.parseInt(s);
        }

        System.out.println(answer);
    }
}
