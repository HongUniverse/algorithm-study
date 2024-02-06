package org.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제이름 : 숫자 카드 게임
 * 문제설명 :
 * 숫자가 N x M 형태로 놓여있다. N은 행의 개수를 의미하며, M은 열의 개수를 의미한다.
 * 행을 선택한다. 선택된 행에 포함되는 카드들 중에서 가장 낮은 숫자의 카드를 뽑는다.
 * 가장 높은 숫자의 카드를 뽑을 수 있는 전략을 세워야 한다.
 * ex)
 * 3 3
 * 3 1 2
 * 4 1 4
 * 2 2 2
 *
 * 출력 => 2
 */
public class Greedy_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        int[][] array = new int[n][m];
        //펼쳐진 카드를 만든다.
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                array[i][j] = sc.nextInt();
            }
        }
        //한 행 씩 꺼내어 가장 작은 숫자를 꺼낸뒤, 가장 큰 숫자로 교체한다.
        for(int[] arr : array){
            int temp = Arrays.stream(arr).min().getAsInt();
            if(temp > result){
                result = temp;
            }
        }

        System.out.println(result);

    }
}
