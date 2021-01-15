package Test01;

import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;

public class Q02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//시작수, 끝수, 배수를 각각 int형 변수에 강제int형 변환을 통해 입력받는다.
		
		System.out.print("시작수: ");
		int FirstNum =Integer.parseInt(scanner.nextLine()); 
		 
		System.out.print("끝수: ");
		int FinalNum =Integer.parseInt(scanner.nextLine());
		
		System.out.print("배수: ");
		int Mult = Integer.parseInt(scanner.nextLine());
		
		//각 추출한 값을 합치기 위해 sum변수를 0으로 초기화	
		int sum = 0;
		
		//시작수 부터 끝수까지 반복문을 사용한다.
		for (int i = FirstNum; i <= FinalNum; i++) {
			
			if(i%Mult==0) { //해당 배수의 나머지가 0인 수를 구분하여 sum에 계속 더하여 준다.
				sum+=i;
			}
		} //시작수에서 끝수까지 for을 이용하여 반복하고 if문을 이용하여 배수를 구별하여 더해준다
		
		System.out.println(sum); //총 합인 sum을 최종적으로 추출
		
		
		
	}

}
