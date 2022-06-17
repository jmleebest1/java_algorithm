package basic;

import java.util.Scanner;

//2.
//피보나치 수열을 출력해라
//An = An-1 + An-2
//1 1 2 3 5 8 13 21 34...
//배열, for

public class Fibonacci {
	
	public static int[] solution (int n) {
		int[] num = new int[n];
		
		num[0] = 1;
		num[1] = 1;
		
		for(int i=2; i<n; i++) {
			num[i] = num[i-1] + num[i-2];
		}
		return num;
	}
	
	public void solution2 (int n) {
		int a = 0, b = 0, c;
		a=1;
		b=1;
		System.out.print(a+" "+b+" ");
		
		for(int i=2; i<n; i++) {
			c= a+b; 
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		for(int v : f.solution(n)){
//		System.out.print(v+" ");
//		}
		f.solution2(n);
	}
}
