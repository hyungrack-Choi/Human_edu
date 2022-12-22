package human15;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		String text = "홍길동/박연수/이수홍";
		StringTokenizer st = new StringTokenizer(text, "/");
		
		int count = st.countTokens();
		
		for (int i = 0; i <count; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();
		
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}