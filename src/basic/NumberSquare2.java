package basic;
//=========================================//
//입력된 수(n) 만큼 n행 n열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오
//4
//정답: 1 2 3 4
//       8 7 6 5
//       9 10 11 12
//       16 15 14 13
//중첩 반복문(for 혹은 while), 조건문(if), 배열
public class NumberSquare2 {
	
	public static void main(String[] args) {
		int n = 3;
		int num = 1;
		
		for (int j=0; j<n; j++) {
			
			for (int i=0; i< n; i++) {
				System.out.printf("%4d", num);
				num++;
			}
			System.out.println();
		}
	}
	
}
