package org.algorithm.greedy;

import java.util.Scanner;

/**
 * 문제이름 : 1이 될 때까지
 * 문제설명 :
 * 1) N에서 1을 뺀다.
 * 2) N을 K로 나눈다.
 * N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 '최소 횟수'를 구하시오
 *
 * 예시 :
 * 입력) 25 5
 * 출력) 2
 */
public class Greedy_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = 0;
        while(n != 1){
            // N이 K로 나누어 떨어지면 K로 나눠준다. 최대한 많이 나눠야 최소 횟수를 구할 수 있기 때문에
            if(n % k == 0){
                n /= k;
            }else{
                n -= 1;
            }
            result ++;
        }

        System.out.println(result);
    }
}
