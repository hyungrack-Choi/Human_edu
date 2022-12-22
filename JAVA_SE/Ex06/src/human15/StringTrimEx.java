package human15;

public class StringTrimEx {

	public static void main(String[] args) {

		String tel1 = "   01";
		String tel2 = "234   ";
		String tel3 = "   5678   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}

}
