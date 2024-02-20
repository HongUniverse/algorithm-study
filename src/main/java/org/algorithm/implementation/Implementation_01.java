package org.algorithm.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제이름 : 상하좌우
 * 문제설명 :
 * 여행가는 N  x N 크기의 정사각형 공간에 있다. 여행가는 상 U, 하 D, 좌 L, 우 R 방향으로 이동할 수 있으며, 시작 좌표는 항상 (1, 1)이다.
 * 정사각형 공간을 벗어나는 움직임은 무시된다.
 * 예를들어 N = 5인 지도에서 R -> R -> R -> U -> D -> D 로 움직이면 네번째 U는 무시된다. 최종적으로 여행가가 도착하는 좌표는 (3, 4)이다.
 *
 * 예시 :
 * 입력)
 * 5
 * R R R U D D
 * 출력)
 * 3 4
 */
public class Implementation_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        String[] plans = sc.nextLine().split(" ");
        //char 배열의 binarySearch()는 정렬되어 있어야함.

        char[] planChar = {'D', 'L', 'R', 'U'};
        //planChar에 맞게 x좌표와 y좌표의 더해질 수를 차례대로 넣음
        int[] xNums = {1, 0, 0, -1 };
        int[] yNums = {0, -1, 1, 0 };
        //시작 (1, 1)
        int x = 1;
        int y = 1;

        for(int i = 0; i < plans.length ; i++){
            char plan = plans[i].charAt(0);
            //plan이 planChar의 몇번 인덱스인지 찾음
            int idx = Arrays.binarySearch(planChar, plan);

            //임시의 x,y좌표를 만듬
            int tx = x, ty = y;
            tx += xNums[idx];
            ty += yNums[idx];
            //범위를 벗어나면 건너뛴다
            if(tx < 1 || ty < 1 || tx > n || ty > n){
                continue;
            }
            //범위안에 들으면 진짜 x,y좌표에 넣어준다.
            x = tx;
            y = ty;
        }
        System.out.println(x + " " + y);

    }
}
