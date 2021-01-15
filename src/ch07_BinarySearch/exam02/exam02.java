package ch07_BinarySearch.exam02;

import java.util.Arrays;
import java.util.Scanner;

public class exam02 {
	
	public static int binarySearch(int[] item, int found, int start, int end) {
		while (start <= end) {

			//중간값 위치 찾기
			int mid = (start + end) / 2;

			//찾고자 하는 값과 중간값이 같으면 해당 중간값을 리턴하여 뽑아냄
			if (item[mid] == found) {
				return mid;
			}
			
			// 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인 
			else if (item[mid] > found) {
				end = mid - 1;
			}

			// 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
			else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//N값 입력받기
		int n = sc.nextInt();
		int[] item = new int[n];
		
		for (int i = 0; i < item.length; i++) {
			item[i] = sc.nextInt();
		}
		sc.nextLine();
		
		Arrays.sort(item); //이진탐색은 무조건 정렬되어야 함!!
		
		//M값 입력받기
		int m = sc.nextInt();
		int[] found = new int[m];
		
		for (int i = 0; i < found.length; i++) {
			found[i] = sc.nextInt();
		}
		sc.nextLine();
		
		//M번 반복문을 돌려서 해당 부품이 있는지 탐색하기
		for (int i = 0; i < m; i++) {
		
			int result = binarySearch(item, found[i], 0, n-1);
	        if (result == -1) {
	            System.out.print("no ");
	        }
	        else {
	            System.out.print("yes ");
	        }
			
		}
		
	}

}
