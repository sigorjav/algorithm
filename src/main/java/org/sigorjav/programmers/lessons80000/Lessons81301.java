package org.sigorjav.programmers.lessons80000;

import java.util.HashMap;
import java.util.regex.Pattern;

public class Lessons81301 {
    public static void main(String[] args) {
        Solution81301 s = new Solution81301();
        int answer = s.solution("one4seveneight");

        System.out.println(answer);
    }
}

class Solution81301 {
    public int solution(String s){
        int answer = 0;
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("zero",0);
//        map.put("one",1);
//        map.put("two",2);
//        map.put("three",3);
//        map.put("four",4);
//        map.put("five",5);
//        map.put("six",6);
//        map.put("seven",7);
//        map.put("eight",8);
//        map.put("nine",9);
//
//        String[] strArr = s.split("");
//
//        String keyTemp = "";
//        String answerTemp = "";
//
//        for (String value : strArr) {
//            if(!Pattern.matches("[0-9]", value)) {
//                keyTemp += value;
//
//                if(map.containsKey(keyTemp)){
//                    answerTemp += map.get(keyTemp);
//                    keyTemp = "";
//                }
//            }
//            if(Pattern.matches("[0-9]", value)){
//                answerTemp += value;
//            }
//        }

        // hashMap으로 만들어 순회하는 방법도 있지만 replaceAll을 활용하면 보다 깔끔하게 변환할 수 있다.
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0;i<strArr.length;i++){
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }

        answer = Integer.parseInt(s);
        return answer;
    }
}