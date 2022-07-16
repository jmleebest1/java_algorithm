package codingStudio;

import java.util.ArrayList;
import java.util.Arrays;

//이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
//1. 김씨와 이씨는 각각 몇 명 인가요?
//2. "이재영"이란 이름이 몇 번 반복되나요?
//3. 중복을 제거한 이름을 출력하세요.
//4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
public class NameCount {
	public static void main(String[] args) {
		String input = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		
		String[] names = input.split(",");
		
		int jyCount = 0;
		int kimCount = 0;
		int leeCount = 0;
		
		ArrayList<String> name_list = new ArrayList<String>();
		
		for(int i=0; i<names.length; i++) {
			
		if(names[i].equals("이재영"))
			jyCount++;
		
		if(names[i].charAt(0) == '김')
			kimCount++;
		
		if(names[i].charAt(0) == '이')
			leeCount++;
			
		//중복을 제거한 이름만 저장
		if(!name_list.contains(names[i]))
			name_list.add(names[i]);
		}
		
		System.out.println("김씨 : 총 " + kimCount + "명");
		System.out.println("이씨 : 총 " + leeCount + "명");
		
		System.out.println("이재영 이름 반복 : " + jyCount + "회");
		
		String[] name_arr = name_list.toArray(new String[name_list.size()]);
		
		System.out.print("중복을 제거한 이름 : ");
		for(int i = 0; i < name_arr.length; i++) {
			System.out.print(name_arr[i] + ((name_arr.length == i + 1)?"\t":", "));
		}
		
		//sort인자는 배열만 가능 List불가능
		Arrays.sort(name_arr);
		
		System.out.print("\n" + "이름 오름차순 정렬 : ");
		
		for(int i = 0; i < name_arr.length; i++) {
			System.out.print(name_arr[i] + ((name_arr.length == i + 1)?"\t":", "));
		}
		
	}
	
}
