package org.sigorjav.programmers.lessons181927;

import java.util.Arrays;

public class Lessons181927 {
    public static void main(String[] args) {
        int[] num_list = {2,1,6};
        int[] answer = new int[num_list.length+1];
        int lastNumber = num_list[num_list.length-1];
        int beforeLastNumber = num_list[num_list.length-2];

        for(int i=0;i<num_list.length;i++){
            answer[i] = num_list[i];
        }

        if(beforeLastNumber < lastNumber) {

            answer[answer.length-1] = lastNumber - beforeLastNumber;
        } else {
            answer[answer.length-1] = lastNumber * 2;
        }

        System.out.println(Arrays.toString(answer));
    }
}
