package ch03_Greedy.exam04;

import java.util.Scanner;

public class exam04_solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		 // N, K를 공백을 기준으로 구분하여 입력 받기
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while (true) {
           
        	//0으로 나눠떨어질때까지
        	while(n%k == 0) {
        		n =n/k;
        		result++;
        	}
        	
        	//만약 1이라면 끝!
        	if(n==1)break;
        	
        	//K보다 작아지면 안됨으로 혹은 아니라면 n의 수를 줄여서 다시 0으로 만들어주기
        	n -=1;
        	result ++;
        }
       
        System.out.println(result);
	}

}
