package basic;

import java.math.BigInteger;
import java.util.Scanner;

//6.
//입력된 두 수의 최대공약수를 구하시오.
//12 18
//정답: 6
//반복문(for, while) if

public class MaximumPledged {
	
	private static int solution(int a, int b) {
		//자바에서는 BinInteger클래스에 최대공약수를 구할 수 있는 gcd()메서드를 제공한다.
		BigInteger b1 = BigInteger.valueOf(a); //BigInterger로 형변환
		BigInteger b2 = BigInteger.valueOf(b);
		BigInteger gcd = b1.gcd(b2); //두 수의 최대공약수
		return gcd.intValue(); //int값을 가져와서 리턴한다
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("최대 공약수를 구할 숫자 두 개를 입력해주세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(MaximumPledged.solution(a, b));
		
	}
}