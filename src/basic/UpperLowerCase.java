package basic;

import java.util.Scanner;

//5.
//대문자는 소문자로, 소문자는 대문자로 변환하시오
//helloWorlD
//정답: HELLOwORLd
//배열, for, if
public class UpperLowerCase {

	public static String solution(String s) {
		String result = ""; //결과를 담아주기 위한 변수 선언
		int temp; //아스키코드(숫자)를 담아줄 int형 변수 선언
		
		for(int i=0; i<s.length(); i++) { //입력받은 s의 길이 만큼 반복문 실행
			temp = (int)s.charAt(i); //문자열은 아스키코드(숫자)로 저장되기 때문에 int형으로 변환
			
			if(65<=temp && temp<=90) { //문자가 대문자인 경우
				result += (char)(temp+32); //32를 더해서 소문자로 변환
			}else if(97<=temp && temp<=122) { //문자가 소문자인 경우
				result += (char)(temp-32); //32를 빼서 대문자로 변환
			}else //그 외의 문자열인 경우
				result += (char)temp; //그대로 출력
		}
		return result;
	}
	
	
//	public static String UpperLower(String s) {

//		
//		String[] str  = new String[s.length()];
//		
//		for(int i=0; i<s.length(); i++) {
//			if(Character.isUpperCase(s.charAt(i)))
//				str = s.charAt(i);
//				
//		}
//		return s;
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자를 입력해주세요 ★영문만 가능");
		String s = sc.next();
		System.out.println(UpperLowerCase.solution(s));
	}
}
