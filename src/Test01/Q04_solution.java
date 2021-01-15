package Test01;

import java.util.Scanner;

public class Q04_solution {
	public static void main(String[] args) {
		/*
		 * 지혜는 총 N개 단어의 뜻을 머릿속으로 암기하고 있을 수 있다. 물어본 단어가 머릿속에 있는 단어라면 1초, 머릿속에 암기하고 있지 않은
		 * 단어이면 3초가 걸린다. 단어를 들을 때마다 머릿속에 빈 자리가 있다면 바로 암기할 수 있다. 만약 머릿속에 N개의 단어를 암기하고 있어
		 * 빈자리가 없다면, 가장 오래된 단어를 잊어버리고 새로운 단어를 암기한다. 하지만 잊어버려야 하는 단어가 외우고 있는 단어들의 평균 길이보다
		 * 길다면, 그 다음 오래된 단어를 잊어버린다. 만약 암기하고 있는 단어를 듣는다면, 해당 단어는 그 순간 새로 외운 것이 된다.(해당 단어의
		 * 암기 시점은 최신이 된다.) 지혜가 외울 수 있는 단어의 수와 선생님이 불러주는 영어단어 리스트가 주어질 때, 전체 영어단어를 대답하는데
		 * 걸리는 시간은 얼마일까? 
		 * 3 10
		 * hi hello bye hi what bye good smart creative create
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		String[] remember; //기억할 수 있는 단어의 수만큼 배열
		String[] totalWord; //외워야 하는 단어의 수만큼 배열
		String value;
		int totalTime = 0, avgLength = 0, checkall = 0;
		int wordNum = 0, remNum = 0;
		boolean nullChk = false, fullChk = false;

		value = sc.nextLine();//외워야하는 단어들
		remember = value.split(" ");  
		remNum = Integer.parseInt(remember[0]); //기억할 수 있는 단어 수를 대입
		wordNum = Integer.parseInt(remember[1]); //외워야하는 단어의 수를 대입

		value = sc.nextLine();
		totalWord = value.split(" "); //전체 단어 목록 삽입

		remember = new String[remNum]; //기억하는 단어수만큼의 배열

		for(int i = 0; i < wordNum; i++) { //외워야하는 단어의 수 만큼 반복
			
			if (totalWord[i].length() > 30 && totalWord[i] != null) { //단어의 갯수가 30개 이상이고 널이 아니면 반복종료
				System.out.println("30글자가 넘는 영단어 존재 : " + totalWord[i]);
				break;
			}
			
			System.out.println("현재 진행도 : " + i);
			System.out.println("현재 단어 : " + totalWord[i]);
			for (int j = 0; j < remNum; j++) { //기억할 수 있는 단어 배열만큼 반복
				if (remember[j] == null) { //처음 단어를 암기할때
					nullChk = true;
					remember[j] = totalWord[i];
					totalTime += 3;
					break;
				} 
				
				else if (remember[j].equals(totalWord[i])) { //외운단어가 있을때 
					value = remember[j];
					System.out.println("같은 값이 비교되는 단어 :" + value);
					
					/**/for (int k = j; k < remNum - 1; k++) { 
						remember[k] = remember[k + 1];
						System.out.println(k + "번 내용 " + remember[k]);
						if (remember[k] == null) {
							remember[k] = value; //**여기서 value는 remember[j]
							break;
						} else if (k == remNum - 2) {
							remember[remNum - 1] = value;
						}
					}

					totalTime += 1;
					break;

				} 
				
			
				else if (remember[j] != null) {
					avgLength += remember[j].length();
					checkall++;

					if (nullChk == false && checkall == remNum) { //잊어야하는 단어가 외운단어들의 평균보다 길다면
						avgLength /= checkall;
						System.out.println("3개 다 채워짐");
						System.out.println("글자 평균 값 : " + avgLength);
						
						for (int l = 0; l < remNum; l++) {
							if (remember[l].length() > avgLength) {//평균길이보다 길다면 다음단어진행
								continue;
							} else {
								System.out.println(remember[l] + "의 길이 : " + remember[l].length());

								fullChk = true;

								for (int m = j; m < remNum - 1; m++) {
									remember[m] = remember[m + 1];
								}
								remember[l] = totalWord[i]; //그 다음으로 오래된 단어를 잊음
								totalTime += 3;
								break;
							}

						}
						
						
						if (fullChk == false) {
							remember[0] = totalWord[i];
							totalTime += 3;
						}
					} 
					
					else {
						continue;
					}
				}
			}
			
			for (int a = 0; a < remNum; a++) {
				System.out.println(a + "번째 값 : " + remember[a] + "  ");
			}

			avgLength = 0;
			checkall = 0;
			nullChk = false;
			System.out.println("==============================");
			System.out.println("총 시간: " + totalTime);
		}
	}
}