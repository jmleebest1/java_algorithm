package basic;

import java.util.ArrayList;

//1.
//학생 정보들을 저장하고, 학생 이름으로 검색했을 때 학번을 출력하는 프로그램 작성.

//Student클래스 생성
//String name, num을 가짐(이름과 학번)
//학생들을 ArrayList에 저장한 이후,
//계속 검색을 하겠냐 y -> 반복
//종료하고 싶으면 n -> 프로그램 종료

//학생 이름이 있는 경우 그 학생의 학번을 출력
//학생 이름이 없으면, 없는 학생이름이라고 출력

//while, flag, ArrayList, foreach

public class Student {
		
	private String name;
	private String num;
	
	Student(){;}

	Student(String name, String num){
		this.name = name;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", num=" + num + "]";
	}

	
}
