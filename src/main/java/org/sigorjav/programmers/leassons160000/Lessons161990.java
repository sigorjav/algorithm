package org.sigorjav.programmers.leassons160000;

import java.util.ArrayList;
import java.util.Arrays;


public class Lessons161990 {
    public static void main(String[] args) {
//        int[] answer = new int[4];
//        boolean hasMinValue = false;
        /**
         * 문제를 보면 최대 값이 50보다 크거나 같다. 따라서 초기값을 최대깂으로 지정해주면 min을 구할때 hasMinValue를 넣을 필요가 없다.
         * 공식처럼 외우면 된다. Math.min()으로 최소값을 넣고싶다면 최대값을 초기화 해주면 되고
         * 반대로 Math.max()로 최대값을 넣고싶다면 -1로 최소값을 넣어주면 된다. (최소값을 0으로 넣을 것이라는 가정하에)
         */
        int[] answer = {51,51,-1,-1};

// 예시 문제
//        String[] wallpaper = {".#...","..#..","...#."};
//        String[] wallpaper = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
//        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        String[] wallpaper = {"..", "#."};

        for(int i=0;i<wallpaper.length;i++){
            char[] chars = wallpaper[i].toCharArray();
            for(int j=0;j<chars.length;j++){
                if(chars[j] == '#'){
                    answer[0] = Math.min(answer[0],i);
                    answer[1] = Math.min(answer[1],j);
                    answer[2] = Math.max(answer[2],i+1);
                    answer[3] = Math.max(answer[3],j+1);

                    /**
                     * 초기 풀었던 답
                     * 뭔가 맘에 들지 않았지만 초기값을 어떻게 설정해야할지 떠오르지 않아
                     * 초기값이 들어가는 시점을 flag로 잡았다.
                     */
//                    if(false == hasMinValue){
//                        answer[0] = i;
//                        answer[1] = j;
//                        answer[2] = i+1;
//                        answer[3] = j+1;
//                        hasMinValue = true;
//                    } else {
//                        answer[0] = Math.min(answer[0],i);
//                        answer[1] = Math.min(answer[1],j);
//                        answer[2] = Math.max(answer[2],i+1);
//                        answer[3] = Math.max(answer[3],j+1);
//                    }
                }
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
