package ch06_Sorting.exam04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class stringChange {

	public static int n, k;
	public static Integer[] arrA, arrB;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		k = Integer.parseInt(input[1]);
		
		arrA = new Integer[n];
		arrB = new Integer[n];
		
		String[] arrTemp = br.readLine().split(" ");
		String[] arrTemp2 = br.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			arrA[i] = Integer.parseInt(arrTemp[i]);
			arrB[i] = Integer.parseInt(arrTemp2[i]);
		}
		
		Arrays.sort(arrA);
		Arrays.sort(arrB, Collections.reverseOrder());
		
		int sum =0;
		for (int i = 0; i < k; i++) {
			sum += arrB[i];
		}
		for (int i = k; i < n; i++) {
			sum += arrA[i];
		}
		
		System.out.println(sum);

	}

}
