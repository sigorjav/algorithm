package org.sigorjav.programmers.lessons40000;

import java.util.Arrays;

/**
 * 내가 코딩을 하는 이유
 * - 한번 시작한 일은 잘할 떄까지 해보고싶다.
 *   한가지를 깊게 파고들어 그걸 잘하게 되어보고난 후에 내가 이 일을 진짜 좋아하는지 아닌지 알 수 있기 때문이다.
 *   조금 해보고 다 알았다는 듯이 어떤 일에 대한 가치를 판단하기에 내가 가진 능력은 너무 미약 하기 때문이다.
 *   죽을둥 살둥 해보며 따라가야 그 때서야 나는 이 일이 맞는구나 혹은 이일은 나와 맞지 않는구나를 알게 된다.
 */

/**
 * 배운점
 * - 경우의 수를 따져보면서 1,3 번사이에 낀 2번이 어떻게 하면 중간에 껴있는 상황을 피할 수 있을까 고민을 많이 했다.
 *   체육복을 빌려주기 전에 앞에 사람의 번호를 확인하고 혹은 뒤에 사람의 번호를 확인한 후에 줄 수 있을까? 라는 생각과
 *   객체로 만들어서 속성으로 값을 만들어야하나? 라는 생각을 많이 하면서 문제를 풀었다.
 *   그러나 어떻게 생각해도 성능적으로 불필요하게 객체를 만들 필요가 없었다.
 *   하지만 한 명의 학생이라는 문제의 상황에 너무 빠져들어 객체 이상으로 보여지지가 않았다.
 *   답을 확인해본 결과 학생의 수를 가지고있는 숫자는 결국 카운트를 1증가시키기 위한 도구에 지나지 않았음을 알게 되었고
 *   -1로 처리해 버림으로써 현재 lost 가 1이고 reserve가 2인 상황에서 다음 lost가 3인 상황을 생각하지 않아도
 *   체육복을 빌려줄 사람들의 카운트를 증가시킬 수 있었다.
 *
 *   처음엔 어떻게 이게 되지? 라고 생각하며 받아들이기 힘들었는데
 *   reserve, lost를 그냥 카운트 점수라고 생각하니 한층 받아 들이기 쉬워졌다.
 */
public class Lessons42862 {
    public static void main(String[] args) {
        int n = 4; // 전체 학생수
        int[] lost = {1,3};
        int[] reserve = {2,4};
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i = 0; i<lost.length;i++){
            for(int j = 0; j<reserve.length;j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for(int i = 0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
