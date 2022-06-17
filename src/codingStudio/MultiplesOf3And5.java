package codingStudio;

//10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
//1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
public class MultiplesOf3And5 {
	//조건 : 1000미만
	
	
	public static void main(String[] args) {
		int result = 0;

		int t = 3;
		int f = 5;
		
		result = t*t + t*(t-1) + t*(t-2) +
		f ;
		
		System.out.println(result);
	}
}
