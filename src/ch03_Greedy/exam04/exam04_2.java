package ch03_Greedy.exam04;

import java.util.Scanner;

public class exam04_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int count=0;
		
		while(true) {
			
			while(n%k ==0) {
				n = n/k;
				count++;
			}
			
			if(n==1) {break;}
			
			n--;
			count++;
			
			
		}
		
		System.out.println(count);
		

	}

}
