package Test01;
import java.util.Scanner;

public class check4_add {

	public static void main(String[] args) {

		
Scanner sc = new Scanner(System.in);
		
		//최종 걸린 시간
		int result = 0;
		
		//오래된 단어를 찾기 위한 카운트
		int count = 0;
		
		//기억 공간 개수
		int memoryNum = Integer.parseInt(sc.next());
		//단어의 수
		int w = Integer.parseInt(sc.next());
		sc.nextLine();
		
		//단어 배열
		String[] word = new String[w];
		
		//기억공간배열
		String[] memory = new String[memoryNum];
		
		//단어와 카운팅한 값을 매칭하기 위한 배열
		int[] memoryCount = new int[memoryNum];
		
		//메모리 초기화
		for(int  i =0; i < memoryNum; i++) {
			memory[i] = "";
		}
		
		
		//사용자에게 단어를 입력받음.
		for(int i = 0; i < w; i++) {
			word[i] = sc.next();
		}
		
		sc.nextLine();
		
		//단어개수만큼 반복
		yes:for(int i = 0; i < w; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("["+memory[j]+"]");
			}
			System.out.println();
			//단어가 기억공간에 존재하는지  찾는 반복문
			for(int j = 0; j < memoryNum; j++) {
				//있을경우
				if(memory[j].equals(word[i])) {
					
					//암기 시점을 최신으로 갱신하기 위해 카운팅
					count += 1;
					
					//암기하고 있는 단어 인덱스 위치에 매칭한 배열에 갱신한 카운트 값을 넣는다. 
					memoryCount[j] = count;
					
					//암기하고 있으므로 1초걸림
					result += 1;
					
					//나머지 연산 건너뜀
					continue yes;
				}
				
				
			}
			
			//단어가 기억 공간에 없으므로 3초 걸림
			result += 3;
			
			//기억 공간의 빈자리가 있는지 확인
			for(int j = 0; j < memoryNum; j++) {
				//yes
				//기억 공간의 ""이 있다면 바로 해당 단어를 저장
				if(memory[j] == "") {
					memory[j] = word[i];
					
					//오래된 단어를 체크할 수 있는 count 변수
					count += 1 ; 
					memoryCount[j] = count;
					
					//단어를 저장했으므로 나머지 연산 건너뜀
					continue yes;
				}
			}
			
			//기억 공간에 남은 자리가 없으므로 가장 오래된 단어를 찾는다.
			//먼저 현재 단어의 평균 길이를 구함.
			double avg = 0;
			for(int j = 0; j < memoryNum; j++) {
				avg += memory[j].length();
			}
			avg = avg / memoryNum;
			
			//index를 0부터 찾되 평균길이보다 긴 것은 패스하고 평균길이보다 짧은 것과 
			//그 다음 index를 비교하여 그 다음 index가 더 오래 되었다면 평균길이보다
			//짧은지 다시 확인한 뒤 짧다면 그 index를 넣고 그렇지 않다면 기존의 index를 유지하고
			//다시 평균 길이보다 짧은 index를 찾는다.
			int oldNumber = 0;
			
			//오래된 단어를 찾는데 평균길이보다 짧아야 하므로 평균길이보다 짧은 값을 가지고 있는 index를 찾는다.
			for(int j = 0; j < memoryNum; j++) {
				//평균 길이보다 짧은지 확인
				if(memory[j].length() < avg) {
					oldNumber = j;
					break;
				}
			}
			
			for(int j = 0; j < memoryNum; j++) {
				//평균 길이보다 긴지 확인
				if(memory[j].length() > avg) {
					//길면 패스하고 기억하고 있는 다음 단어로
					continue;
				}
				
				//메모리 단어와 매칭되어 있는 카운트 배열을 이용하여 최솟값을 찾는다.
				if(memoryCount[j] < memoryCount[oldNumber]) {
					oldNumber = j;
				}
			}
			count += 1;
			
			//오래된 인덱스의 단어 넣고 카운트값 갱신
			memory[oldNumber] = word[i];
			memoryCount[oldNumber] = count; 
		}
		
		System.out.println("걸린 시간:" + result);
		
		
		
		
	}

}
