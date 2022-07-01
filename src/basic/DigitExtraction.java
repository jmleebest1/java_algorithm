package basic;

import java.util.Scanner;

//입력된 수를 높은 자리수 부터 출력하시오.
//2312
//정답:
//2
//3
//1
//2

public class DigitExtraction {
	
	public static void extract(int n) {
		if(n/10 == 0) {
			System.out.println(n);
			return;
		}
		
		extract(n/10);
		System.out.println(n%10);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
	}
}
