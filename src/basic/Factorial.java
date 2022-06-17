package basic;

import java.util.Scanner;

//입력된 수의 팩토리얼을 구하시오
//5
//정답 : 120

public class Factorial {
	
	public int factorial(int i) {
		int temp = 0;
		
		
		while(i != 1) {
			temp += (i * (i-1));
			i = i-2;
			temp += i;
			i--;
			temp += i;
			i--;
		}
		
		return temp;
	}
		
	public static void main(String[] args) {
		Factorial f = new Factorial();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(f.factorial(i));
	}
}
	
	
	
	

