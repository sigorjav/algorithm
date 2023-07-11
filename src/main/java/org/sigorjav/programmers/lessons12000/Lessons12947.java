package org.sigorjav.programmers.lessons12000;

public class Lessons12947 {
    public static void main(String[] args) {
        int[] xArr = {1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 12, 18, 20, 21, 24, 27, 30, 36, 40, 42, 45, 48, 50, 54, 60, 63, 70, 72, 80, 81, 84, 90,
                100, 102, 108, 110, 111, 112, 114, 117, 120, 126, 132, 133, 135, 140, 144, 150, 152, 153, 156, 162, 171, 180, 190, 192, 195, 198,
                200, 201, 204, 207, 209, 210, 216, 220, 222, 224, 225, 228, 230, 234, 240, 243, 247, 252, 261, 264, 266, 270, 280, 285, 288,
                300, 306, 308, 312, 315, 320, 322, 324, 330, 333, 336, 342, 351, 360, 364, 370, 372, 375, 378, 392, 396, 399,
                400, 402, 405, 407, 408, 410, 414, 420, 423, 432, 440, 441, 444, 448, 450, 460, 465, 468, 476, 480, 481, 486
        };

        Solution12947 s = new Solution12947();
        int count = 0;
        for(int x : xArr){
            if(s.solution(x)){
               count++;
            }
        }

        System.out.println(count == xArr.length);
    }
}

class Solution12947 {
    public boolean solution(int x) {
        if(x < 10){
            return true;
        }

        boolean answer = true;

        String s = String.valueOf(x);
        String[] temp = s.split("");

        int sum = 0;
        for (String n : temp) {
            sum += Integer.parseInt(n);
        }

        answer = x % sum == 0;

        return answer;
    }
}
