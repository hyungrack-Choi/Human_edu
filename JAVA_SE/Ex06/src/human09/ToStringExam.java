package human09;

import java.util.Objects;

public class ToStringExam {

	public static void main(String[] args) {

		String str1 = "홍길동";
		String str2 = null;
		String str3 = "최형락";
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,str3));
	}

}
