package human15;

public class ByteToStringExample {

	public static void main(String[] args) {

		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		//아스키 코드 -> 문자열로 변환
				
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		//6번째에서 4개를 선택하여 문자열 생성.
		System.out.println(str2);
	}
}