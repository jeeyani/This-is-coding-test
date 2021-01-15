package Test01;
import java.util.Scanner;

public class check4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		//최종 걸린 시간
		int result = 0;
		
		//가장오래 기억된 단어를 구별하기 위한 카운터 변수
		int count = 0;
		
		//기억 공간 개수
		int memoryNum = Integer.parseInt(sc.next());
		//단어의 수
		int w = Integer.parseInt(sc.next());
		sc.nextLine();
		
		//입력받은 개수의 따른 배열 크기 설정
		String[] word = new String[w]; //외워야할 단어의 수 만큼 배열 생성
		String[] memory = new String[memoryNum]; //기억할 수 있는 단어의 수 만큼 배열 생성
		
		//null값 삽입을 방지하기 위한 메모리 초기화
		for(int  i =0; i < memoryNum; i++) {
			memory[i] = "";
		}
		
		//오래된 단어를 체크하기 위해 카운터 배열 생성
		int[] memoryCount = new int[memoryNum];
		
		//사용자에게 외워야 할 단어를 입력받음.
		for(int i = 0; i < w; i++) {
			word[i] = sc.next();
		}
		sc.nextLine();
		
		
		//1.외워야할 단어의 수만큼 반복
		yes:for(int i = 0; i < w; i++) {
			
			//2.단어가 기억공간에 존재하는지  찾는 반복문
			for(int j = 0; j < memoryNum; j++) {
				//내가 외우고 있는 단어라면 1초를 결과값에 추가하고 yes라벨로 continue한다.
				if(memory[j].equals(word[i])) {
					
					//암기시 계속해서 카운트 증가(가장 최근에 외운 단어를 찾기 위함)
					//카운터 숫자를 카운터 배열에 삽입
					count += 1;
					memoryCount[j] = count;
					
					//결과값 갱신
					result += 1;
					
					continue yes;
				}
				
				
			}//2.for문종료
			
			//단어가 기억 공간에 없으므로 3초 걸림
			//외우고 있는 단어가 아닌 이상 나머지경우는 모두 3초가 걸림
			result += 3;
			
			//3.기억 공간의 빈자리가 있는지 확인
			for(int j = 0; j < memoryNum; j++) {
				
				//기억 공간이 비어있다면  해당 단어를 저장
				if(memory[j] == "") {
					memory[j] = word[i];
					
					//오래된 단어를 체크할 수 있는 count 변수
					//암기시 계속해서 카운트 증가(가장 최근에 외운 단어를 찾기 위함)
					//카운터 숫자를 카운터 배열에 삽입
					count += 1 ; 
					memoryCount[j] = count;
					
					//단어를 저장했으므로 나머지 뒤에 연산은 건너뜀
					continue yes;
				}
			}//3번 for문종료
			
			//기억 공간에 남은 자리가 없으므로 가장 오래된 단어를 찾는다.
			//(조건)외우고 있는 단어들의 길이의 평균을 구한다
			double avg = 0;
			for(int j = 0; j < memoryNum; j++) {
				avg += memory[j].length();
			}
			avg = avg / memoryNum;
			
			//4.제일 오래된 index 찾기
			//카운터배열을 이용하여 제일 오래된 단어를 찾는다
			int oldNumber = 0; //제일 오래된 index의 수를 삽입하기 위한 변수
			for(int j = 0; j < memoryNum-1; j++) {
				
				//평균 길이보다 긴지 확인
				if(memory[j].length() > avg) {
					//길면 그 다음으로 오래된 단어를 찾아야 함으로 continue
					continue;
				}
				
				//평균보다 길지 않는다면 카운트를 이용하여 오래된 단어를 찾는다.
				//카운터배열 중에 가장 값이 작은 단어가 오래된 단어임으로 배열을 비교하여 최솟값을 찾는다.
				if(memoryCount[j] < memoryCount[j+1]) {
					oldNumber = j; //가장 오래 기억된 단어의 index를 기억
				} else {
					oldNumber = j + 1;
				}	
				
			}//4.종료
			
			count += 1; //계속 카운터는 증가
			
			//오래된 인덱스의 새로운 단어 넣고 이후 카운트값도 갱신
			memory[oldNumber] = word[i];
			memoryCount[oldNumber] = count; 
		
		} //1.외워야하는 단어의 수만큼 반복문
		
		System.out.println("걸린 시간:" + result);
		
		
	}

}
