package org.sigorjav.programmers.lessons181832;

import java.util.Arrays;

public class Lessons181832 {
    public static void main(String[] args) {
        int n = 4;

        int x=0;
        int y=0;
        int[][] answer = new int[4][4];
        int temp = 0;
        int value = 1;

        while(value <= n*n){
            // n-x = 4-0
            for(int right = x; right < n-x; right++){
                answer[y][right] = value++;
                temp=right;
                if(value >= n*n){
                    break;
                }
            }
            y++;
            x = temp;

            // down이 왜 down <= n-y 과 같은가?
            // n-y = 4-1
            // 1
            // 2
            // 3
            for(int down = y; down <= n-y;down++){
                answer[down][x] = value++;
                temp=down;
                if(value >= n*n){
                    break;
                }
            }
            y = temp;
            x--;

            // 여기서 왜 n-1을 하지?
            // n - 1 - y = 4 - 1 - 3 = 0
            //
            for(int left = x; left >= n - 1 - y; left--){
                answer[y][left] = value++;
                temp=left;
                if(value >= n*n){
                    break;
                }
            }
            y--;
            x = temp;

            // x 보다 1 작을 때 까지 위로 올림
            for(int up=y; up > x;up--){
                answer[up][x] = value++;
                temp = up;
                if(value >= n*n){
                    break;
                }
            }
            y= temp;
            x++;
        }

        System.out.println(Arrays.deepToString(answer));

    }
}
