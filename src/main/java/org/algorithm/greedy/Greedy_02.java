package org.algorithm.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제이름 : 큰 수의 법칙
 * 문제설명 :
 * 다양한 수로 이루어진 배열이 있을 때 주어진 수들을 M번 더하여 가장 큰 수를 만드는 방법이다.
 * 단, 배열의 인덱스에 해당하는 수가 연속해서 K번을 초과하여 더해질 수 없는 것이 이 법칙의 특성이다.
 * 배열의 크기 N, 숫자가 더해지는 횟수 M, 그리고 K가 주어질 때 동빈이의 큰 수의 법칙에 따른 결과를 출력하시오.
 * ex)
 * 5, 8, 3
 * 2 4 5 4 6
 * 출력 => 46
 */
public class Greedy_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        //접근 방법 -> 가장 큰 수를 k번 더하고 두번 째로 큰 수를 한 번 더하는 반복으로 M번 더한다.

        //가장 큰 수
        int first = arr[n-1];
        //두 번째로 큰 수
        int second = arr[n-2];
        //가장큰수 k번 + 두 번째로 큰수 묶음의 갯수
        int cnt = m/(k+1);
        //나누고 나누어 떨어지지 않은 가장 큰수의 갯수
        int remainCnt = m%(k+1);

        int result = (first * k + second) * cnt;
        result += first * remainCnt;

        System.out.println(result);

    }
}
