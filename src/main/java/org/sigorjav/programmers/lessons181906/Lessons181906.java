package org.sigorjav.programmers.lessons181906;

import java.util.Arrays;
import java.util.Objects;

public class Lessons181906 {
    public static void main(String[] args) {
        String my_string = "banana";
        String is_prefix = "ban";
        int answer = 0;
//        String[] my_string_split = my_string.split("");
//        String[] is_prefix_split = is_prefix.split("");

//        if(is_prefix_split.length>my_string_split.length){
//            answer = 0;
//        } else {
//            for(int i=0;i<is_prefix_split.length;i++){
//                if (!Objects.equals(my_string_split[i], is_prefix_split[i])) {
//                    answer = 0;
//                    break;
//                }
//            }
//        }
        // 위 모든 식을 startsWith으로 끝낼 수 있다.
        if (my_string.startsWith(is_prefix)) answer = 1;
        System.out.println(answer);
    }
}
