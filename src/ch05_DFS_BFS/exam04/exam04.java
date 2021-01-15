package ch05_DFS_BFS.exam04;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exam04 {

	public static int n, m; //미로 칸의 크기
	public static int[][] maze = new int[201][201]; //미로행렬의 최대크기 설정 및 초기화

	// 이동할 네 가지 방향 정의 (상, 하, 좌, 우) 
	public static int dx[] = { -1, 1, 0, 0 };
	public static int dy[] = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// N, M을 공백을 기준으로 구분하여 입력 받기
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();

		//미로행렬 정보 입력받기
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine(); //행마다 한줄씩 입력받기 위해서
			for (int j = 0; j < m; j++) {
				maze[i][j] = str.charAt(j) - '0';//문자열을 정수형에 넣기 위해서 
			}
		}

		// BFS를 수행한 결과 출력
		System.out.println(bfs(0, 0));

	}

	// bfs함수 정의
	public static int bfs(int x, int y) {
		// 큐(Queue) 구현을 위해 queue 라이브러리 사용 
		Queue<Node> q = new LinkedList<>();
		q.offer(new Node(x, y)); //시작지점 노드 넣기
		
		// 1.큐가 빌 때까지 반복하기 
		while (!q.isEmpty()) {
			Node node = q.poll(); //노드 빼기(이미 방문한 노드는 빼야하기때문!)
			
			//각 좌표값 입력
			x = node.getIndex();
			y = node.getDistance();
			
			//2.현재 위치에서 4가지 방향(상하좌우)으로의 위치 확인
			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				// 미로 공간을 아예 벗어난 경우 무시
				if (nx < 0 || nx >= n || ny < 0 || ny >= m)
					continue;
				//갈 수 없는 곳은 무시
				if (maze[nx][ny] == 0)
					continue;
				// 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
				if (maze[nx][ny] == 1) {
					maze[nx][ny] = maze[x][y] + 1; //방문한 곳에 값을 계속 증가 시켜두기
					q.offer(new Node(nx, ny)); //해당 노드를 큐에 삽입
				}
			}//2.for종료
		}//1.while종료
		
		// 가장 오른쪽 아래까지의 최단 거리 반환
		return maze[n - 1][m - 1];
	}
}

//노드 클래스 정의
class Node {

	private int index;
	private int distance;

	//생성자
	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}

	//메소드
	public int getIndex() {
		return this.index;
	}

	public int getDistance() {
		return this.distance;
	}
}
