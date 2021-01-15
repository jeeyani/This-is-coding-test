package ch06_Sorting.exam04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	    // N을 입력받기
        int n = sc.nextInt();
        
        //k를 입력받기
        int k = sc.nextInt();
        
        Integer[] Aarr = new Integer[n]; //정수형 리스트 선언
        Integer[] Barr = new Integer[n]; //정수형 리스트 선언
		
        
        for (int i = 0; i < n; i++) {
        	Aarr[i] = sc.nextInt();
		}
        
        for (int i = 0; i < n; i++) {
        	Barr[i] = sc.nextInt();
		}
        
        Arrays.sort(Aarr); //오름차순으로 정리
        Arrays.sort(Barr, Collections.reverseOrder()); //내림차순으로 정리
        
       for (int i = 0; i < k; i++) {
    	   Aarr[i] = Barr[i];
       } //**굳이 둘의 크기를 비교해야할까?
       
       int sum = 0;
       for (int i = 0; i < n; i++) {
       
    	   sum +=Aarr[i];
    	   
		}
       
       System.out.println(sum);
	}
	
}
