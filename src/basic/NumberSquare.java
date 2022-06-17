package basic;

//입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
//4
//정답: 1 2 3 4
//		  5 6 7 8
//       9 10 11 12
//       13 14 15 16
//중첩 반복문 (for 혹은 while)
public class NumberSquare {
	
//	public String[] NumberSquare(int num) {
//		int numLength = 0;
//		int temp = 0;
//		numLength = num * num;
//		
//		for(int i=0; i<numLength; i++) {
//			String[] numArr = String.valueOf(numLength - i).split("");
//		}
//		String result = String.join(" ", numArr);
//		String result = String.valueOf(numArr);
//		return numArr;
//	}
	
	
	
	
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
