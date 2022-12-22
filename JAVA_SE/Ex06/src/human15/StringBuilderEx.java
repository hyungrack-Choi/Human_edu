package human15;

public class StringBuilderEx {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		//StringBuilder 객체 생성
		sb.append("Java");
		sb.append("Program Study");
		System.out.println(sb.toString());
		//문자열을 끝에 추가.
		sb.insert(4, "2");
		System.out.println(sb.toString());
		//index4 위치 뒤에 2를 삽입
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		//index4위치의 문자르 6으로 변경
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		//index6부터 index 13 '전'까지르 "book"문자열로 대치
		sb.delete(4, 5);
		System.out.println(sb.toString());
		//index4부터 index5 '전'까지 삭제
		int length = sb.length();
		System.out.println("총방문자수: " + length);
		//총 방문자수 얻기
		String result = sb.toString();
		System.out.println(result);
		//버퍼에 잇는 것을 String 타입으로 리턴
		
		String str = sb.toString();
		String str2 = str + " / human computer";
		System.out.println(str2);
	}
}