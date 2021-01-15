package ch03_Greedy.exam02;

import java.util.Arrays;
import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next()); // 첫째줄 입력 
		int M = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		int sum = 0;
		
		int[] arry = new int[N];

		for (int i = 0; i < arry.length; i++) {
			arry[i] = Integer.parseInt(sc.next());
		}
		sc.nextLine();

	
		Arrays.sort(arry); //오름차순으로 정렬!!!! sort!!!!
		int max = arry[N-1]; //제일 큰 수
		int max_2 = arry[N-2]; // 그 다음으로 큰 수
		
		/*반복되는 수열을 찾는다. 
		가장 큰 수는 K번 만큼 반복되고 그 다음수는 K-1만큼 반복된다
		우리는 가장 큰 수를 만드는 것이 목적임으로 가장 큰 수는 최대한 많이 더해주고
		그다음 작은 수는 한번 만 더해주는 것으로 생각을 하자.
		즉 (K+1)만큼 같은 형태의 수열이 반복된다.
		총 이 수열이 반복된 횟수는 M/(K+1) 이고  
		가장 큰 수가 더해지는 수는  (M/(K+1))*K 이다.
		만약 나눠떨어지지 않는 경우를 고려하여 (M/(K+1))*K + m % (k + 1)를 해준다.
		*/
		int Bigcount = (M / (K + 1)) * K + M %(K+1);
        
		//큰 수가 더해지는 횟수를 이용하여 총 합을 구한다
		sum +=Bigcount * max;
		sum +=(M-Bigcount) *max_2; // 두번째로 큰 수 더하기
		
		System.out.println(sum);
	}

}
