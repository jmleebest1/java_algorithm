package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Management {
	
	public static void main(String[] args) {
		Student std1 = new Student("신재민", "1215");
		Student std2 = new Student("이순신", "1356");
		Student std3 = new Student("장보고", "1436");
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(std1);
		list.add(std2);
		list.add(std3);
		
		list.forEach(v->System.out.println(v));
		
//		for(Student s : list) {
//			System.out.println(s);
//			System.out.println(s.getName());
//			System.out.println(s.getNum());
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계속 검색을 하고싶으시면 y, 종료하고 싶으시면 n을 눌러주세요");
		
		while(true) {
			String input = sc.next();
			
			if(input.equals("y")) {
				System.out.println("검색을 시작합니다.\n학생이름을 입력하세요.");
				String name = sc.next();
				boolean check = false;
				
				for(Student s : list) {
				if(name.equals(s.getName())){
					System.out.println("해당하는 학생의 학번은:" + s.getNum() + "입니다.");
					check = true;
				}
				
			}
				if(!check) {
					System.out.println("해당하는 학생의 이름이 없습니다.");
				}
			}
			else if(input.equals("n")) {
				break;
			}
			else if(!input.equals("y") || !input.equals("n")) {
				System.out.println("다시 입력해주세요.");
			}
		}
			
		System.out.println("프로그램이 종료되었습니다."); //n을 누르면 while문을 탈출하며 문구가 출력된다.
	}
		

}
