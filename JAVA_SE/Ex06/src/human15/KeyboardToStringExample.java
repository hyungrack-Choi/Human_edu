package human15;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		//system.in.read : 키보드에서 입력한 글짜를 buytes의 배열변수에 담는 기능을 수행.
		//엔터를 치는 순간 그때까지 담겨진 글자의 수를 readbytesno 대입을함.
		//엔터를 치는 순간 2개의 문자가 더 붙음 (캐리지리턴(\r), 라인피드(\n) 2개의 문자가 더 붙음.
		
		System.out.println("readBytesNo :" + readByteNo);
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
		//영문은 한글자당 1byte 단위로 처리되는데
		//영문외에는 한글자당 2~3byte 단위로 처리를 함.
		//아스키코드는 영문위주이고, UTF-8 등등의 다른 코드체계가 생겼는데. 이는 다국어 지원을 위한것임.
	}
}