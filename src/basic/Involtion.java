package basic;

import java.util.Scanner;

//다음 입력 n의 m승의 결과를 출력하시오
//입력 : 5 3
정답 : 125
public class Involtion {	
	public static void main(String[] args) {
		int n = 5;
		int m = 3;
		int res = 1;

		for(int i = 0; i < m; i++){
			res *= n;
		}	

	}
}
