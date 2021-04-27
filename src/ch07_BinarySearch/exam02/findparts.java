package ch07_BinarySearch.exam02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class findparts {

	public static int n,m;
	public static int[] numParts;
	public static int[] needs;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		numParts = new int[n];
		
		String[] temp = br.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			numParts[i] = Integer.parseInt(temp[i]);
		}
		
		m = Integer.parseInt(br.readLine());
		needs = new int[m];
		
		String[] mTemp = br.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			needs[i] = Integer.parseInt(mTemp[i]);
		}
		
		Arrays.sort(numParts);
		
		for (int i = 0; i < m; i++) {
			
			int result = binary(numParts, needs[i], 0, n-1);
	        if (result == -1) {
	            System.out.print("no ");
	        }
	        else {
	            System.out.print("yes ");
	        }
			
		}

	}

	private static int binary(int[] parts, int target, int start, int end) {
		while (start <= end) {

			//중간값 위치 찾기
			int mid = (start + end) / 2;

			//찾고자 하는 값과 중간값이 같으면 해당 중간값을 리턴하여 뽑아냄
			if (parts[mid] == target) {
				return mid;
			}
			
			// 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인 
			else if (parts[mid] > target) {
				end = mid - 1;
			}

			// 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
			else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
