package Test02;

import java.util.*;

public class check02 {
	public static void main(String[] args) {
		//신경써야 할 점
				//1) ( 올라가는 것, )가 내려가는 것이므로 올라갈 때 마다 +1, 내려갈 때마다 -1
				//2) (,)가 짝이 맞는지 확인
				//3) #이 짝이 맞는지 확인
				//4)#사이의 ()가 완성이 되는지 확인
				//5)등고선이 먼저 끊어지는 곳이 없는지 확인
				
		
		
		Scanner sc = new Scanner(System.in);
		//등고선을 문자열로 입력받기
		String mount = sc.nextLine();
		
		//계단산의 높이를 알려주는 정수값
		int height = 0;
		
		//현재 급경사 여부를 알려주는 변수, 초기값은 false로 선언
		boolean hash = false;
		
		//급경사 안에 등고선의 수를 세주는 변수, 이를 이용하여 조건충족을 구분
		int hashInCount = 0;
		
		//등고선이 온전하지 확인할 수 있는 변수
		boolean check = true;
		
		//최종적으로 구할 칼로리 변수
		int kcal = 0;
		
		//1. 등고선의 길이만큼 반복문
		for(int i = 0; i < mount.length(); i++) {
			
			//해당 등고선으로 들어올 수 있는 문자인 '(' ')' '#' 총 세문자만을 비교한다.
			
			//'('가 들어왔으면, 계단을 올라가기 때문에 높이를 1만큼 증가시킨다.
			if('(' == mount.charAt(i)) {
				
				height ++;
				
				//현재 '('가 있는 곳이 급경사구간인지를 확인한다
				//만약 급경사구간이면
				if(hash) {
					
					//급경사 구간내에서는 "(",")"가 짝을 이룬다.
					//"("를 +로 ")"를 -로 생각하여 hashInCount를 계산한다.
					//따라서 hashInCount가 0이하면 급경사구간에서 짝을 이루지 않음으로 잘못된 등고선이다
					if(hashInCount < 0) {
						check = false;
						break;
					} 
					//급경사 구간내에 등고선이 제대로 짝을 이루면
					else {
						//해당 if문은 '('를 구별하는 문임으로 hashInCount를 1증가시킨다.
						hashInCount ++;
						
						//해당 구간은 급경사구간임으로 높이를 2배 증가시킨다
						kcal += (height*2);
					}
				} 
				//급경사 구간이 아니면 높이를 1만큼만 증가시킨 값을 결과값에 대입한다
				else {
					kcal += height;
				}
			} 
			
			
			//')'가 들어왔으면, 계단을 내려가기 때문에 높이를 1만큼 감소시킨다.
			//여기서 중요한 것은 현재의 높이만큼 칼로리를 소모한다
			else if(')' == mount.charAt(i)) {
				
				//위의 방식과 동일하게 급경사구간 인지 아닌지를 구별한다
				if(hash) {
					if(hashInCount < 0) {
						check = false;
						break;
					}else {
						kcal += (height*2);
						hashInCount -= 1;
					}
				} 
				else {
					kcal += height;
				}
				//경사가 내려가는 것이므로 층수 -1
				height --;
				
			} 
			
			//'#'이 들어왔으면, 급경사의 시작을 알리는 것인지 끝을 알리는 것인지 확인해야한다
			else if('#' == mount.charAt(i)) {
				//현재 hash가 true라면, 현재 '#'은 급경사의 끝임으로 마지막으로 급경사구간 내의 짝이 온전한지 확인하다
				if(hash) {
					//#내의 (가 남아있지 않는지 확인
					if(hashInCount == 0) {
						hash = false;
					}else {
						check = false;
						break;
					}
				} else { //현재 hash가 false라면, 현재 '#'는 급경사의 시작임으로 다시 올 '#'을 위해 true값으로 갱신한다
					hash = true;
				}		
			} 
			//마지막으로 등고선이 마지막까지 온전한 형태인지 확인해야한다.
			//높이 0일때 이때의 값이 등고선의 마지막위치인지 아닌지를 확인한다.
			if(height == 0) {
				//만약 등고선의 마지막 위치가 아니라면 이는 중간에 끊어진 등고선임으로 잘못된 결과이다.
				if(mount.length() - 1 != i) {
					check = false;
					break;
				} 
			}
		}//1.반복문 종료
		
		//최종적으로 등고선 끝까지 높이가 0이고 모든 check값이 true이면 완전한 등고선이다.
		if(height== 0 && check == true) {
			System.out.println(kcal);
		} else {//아니라면 잘못된 등고선이다.
			System.out.println("잘못된 등고선입니다.");
		}
	
	
	
	}
	
	
	
	
}

