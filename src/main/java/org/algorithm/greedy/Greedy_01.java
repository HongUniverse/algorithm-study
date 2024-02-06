package org.algorithm.greedy;

/**
 * 문제 이름 : 거스름돈
 * 문제 설명 :
 * 카운터에는 거스름돈으로 사용할 500원, 100원, 50원, 10원짜리 동전이 무한히 존재한다고 가정한다.
 * 거슬러 줘야할 돈이 N원일 때 거슬러 줘야할 동전의 최소 개수를 구하라.
 * 단, 거슬러 줘야 할 돈은 항상 10의 배수이다.
 * N이 1260이라면 손님이 받을 동전의 최소 갯수는?
 */
public class Greedy_01 {
    public static void main(String[] args) {
        int n = 1260;
        int cnt = 0;
        int[] coinTypes = {500, 100, 50, 10};

        for(int coin : coinTypes){
            cnt += n/coin;
            n %= coin;
        }
        System.out.println(cnt);
    }

}
