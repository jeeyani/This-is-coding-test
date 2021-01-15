package ch06_Sorting.exam03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Student implements Comparable<Student> { //객체간의 순서를 정리해주는 인터페이스

    private String name;
    private int score;

    //생성자
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    // 정렬 기준은 '점수가 낮은 순서'
    @Override
    public int compareTo(Student other) {
        if (this.score < other.score) {
            return -1;
        }
        return 1;
    }
}

public class exam03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    // N을 입력받기
        int n = sc.nextInt();

        // N명의 학생 정보를 입력받아 리스트에 저장
        List<Student> students = new ArrayList<>(); //학생타입의 리스트
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score)); //각각을 하나의 리스트에 넣기
        }

        Collections.sort(students); //내림차순으로 정렬

        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i).getName() + " ");
        }

		
	}

}
