package codingStudio;

//이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
//1. 김씨와 이씨는 각각 몇 명 인가요?
//2. "이재영"이란 이름이 몇 번 반복되나요?
//3. 중복을 제거한 이름을 출력하세요.
//4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
public class NameCount {
	public static void main(String[] args) {
		String input = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		
		String[] names = input.split(",");
		
		int count = 0;
		
		for(int i=0; i<names.length; i++) {
		if(names[i].equals("이재영"))
			count++;
		}
		 System.out.println(count);
	}
}
