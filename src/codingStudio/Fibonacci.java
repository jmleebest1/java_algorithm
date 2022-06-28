package codingStudio;

import java.util.ArrayList;

//피보나치 수열의 각 항은 바로 앞의 항 두 개를 더한 것이 됩니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//짝수이면서 4백만 이하인 모든 항을 더하면 얼마가 됩니까?

public class Fibonacci {
	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        for(int i=1;;i++){
            list.add(list.get(i-1)+list.get(i));
            if(list.get(i-1)+list.get(i)>4000000)
                break;
        }

        list.remove(list.get(list.size()-1));
        int sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0)
                sum+=list.get(i);
        }
        System.out.println(sum);
    }
}
