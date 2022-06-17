package basic;

import java.util.Scanner;

//입력된 수의 각 자릿수 합을 구하시오
//1242
//정답: 9
public class TotalEachNum {
	
	public static int getTotalEachNum(int num) {
	Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		//입력받은 숫자를 문자열로 형변환
		String number = String.valueOf(num);
		
		//숫자들을 배열로 담아준다
		String[] numArr = number.split("(?<=.)");
		
		for(int i=0; i<numArr.length; i++) {
			result += Integer.parseInt(numArr[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(TotalEachNum.getTotalEachNum(1234));
	}
	
}
