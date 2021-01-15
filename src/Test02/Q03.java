package Test02;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//******************** 문제3번 허술한 암 ********************//
		System.out.print("테스트 케이스횟수: ");
		int T = Integer.parseInt(scanner.nextLine());
		
		String[] test = new String[T];
		
		int L =0;
		
		for (int i = 0; i < T; i++) { //t번 반복
			System.out.print("글자수: ");
			L = Integer.parseInt(scanner.nextLine()); // t번만큼 L반복 //글자수
			
			
			
			String[] Larry=new String[L]; //글자수 길이만큼 
			   
			
			
			for (int j = 0; j < L; j++) {
				System.out.print("글자수만큼 문자입력: ");
				Larry[j] = scanner.nextLine();
				
				char[] Lchar =new char[Larry[j].length()];
				int[] Lcode = new int[Larry[j].length()];
				
				
				
				
				for (int j2 = 0; j2 < Larry[j].length(); j2++) { //글자수 만큼 반복문실행
					Lchar[j2] = Larry[j2].charAt(j2);
					Lcode[j2] = Lchar[j2];
					
					if(Lcode[j2]<119) {
						Lcode[j2] = Lcode[j2]+4;
						Lchar[j2] = (char)Lcode[j2];
						System.out.print(Lchar[j2]);
					} else {
						Lcode[j2] = (Lcode[j2]+4)-26;
						Lchar[j2] = (char)Lcode[j2];
						System.out.print(Lchar[j2]);
					}
				}
				
				
				
					
				/*for (int k = 0; k < Lcode.length; k++) {
					
					if(Lcode[k]<119) {
						Lcode[k] = Lcode[k]+4;
						Lchar[k] = (char)Lcode[k];
						System.out.print(Lchar[k]);
					} else {
						Lcode[k] = (Lcode[k]+4)-26;
						Lchar[k] = (char)Lcode[k];
						System.out.print(Lchar[k]);
					}
				}
				System.out.println();*/
				
			}
			
			System.out.println("결과");
			System.out.println("Case#"+i+1);
			//System.out.print(Lchar[j2]);
			
		}
		
	}

}
