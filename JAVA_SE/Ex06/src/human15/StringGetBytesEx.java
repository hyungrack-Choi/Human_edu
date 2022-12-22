package human15;

import java.io.UnsupportedEncodingException;

public class StringGetBytesEx {

	public static void main(String[] args) {

		String str ="안녕하세요";
		//영문일때는 1byte,
		//한글 일때는 우리는 UTF-8인코딩 기반이므로 3byte로 처리됨
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length:" + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String:"+str1);
			
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			//EUC-KR이란 인코딩 타입으로 바이트 값으로 얻어온다.
			//EUC-KR은 한글의 경우 1글자가 2byte로 처리됨
			System.out.println("bytes2.length:" + bytes2.length);
			String str2 = new String(bytes2);
			System.out.println("str2->String:"+str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			//EUC-KR이란 인코딩 타입으로 바이트 값으로 얻어온다.
			//EUC-KR은 한글의 경우 1글자가 2byte로 처리됨
			System.out.println("bytes3.length:" + bytes3.length);
			String str3 = new String(bytes3);
			System.out.println("str3->String:"+str3);
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
