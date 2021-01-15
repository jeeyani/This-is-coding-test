package ch07_BinarySearch.exam03;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
	        
	        // 떡의 개수(N)와 요청한 떡의 길이(M)
	        int n = sc.nextInt();
	        int m = sc.nextInt();

	        // 각 떡의 개별 높이 정보 
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        sc.nextLine();
	        
	        int max = 0;
	        for (int i = 0; i < n; i++) {
	            if(max<arr[i]) {
	            	max = arr[i];
	            }
	        }
	        
	        int start = 0;
	        int end = max;
	        int[] res = new int[n];
	        
	        while(true) {
	        	int sum =0;
	        	int mid = (start+end)/2;
	        	
	        	 for (int i = 0; i < n; i++) {
	 	           res[i] = arr[i]-mid;
	 	           sum +=res[i];
	 	        }
	        	 
	        	 if(sum > m) {
	        		 start =mid+1;
	        	 }
	        	 else if(sum < m) {
	        		 end = mid-1;
	        	 }
	        	 else if(sum ==m){
	        		 break;
	        	 }
	        }

	        System.out.println(m);

	}

}
