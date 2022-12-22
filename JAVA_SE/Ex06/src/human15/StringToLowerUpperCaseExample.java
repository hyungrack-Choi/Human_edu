package human15;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 ="Java Programming";
		String str2 ="JAVA Programming";
		
		System.out.println(str1.equals(str2));
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println("-----------");
		String lowerStr3 = str1.toUpperCase();
		String lowerStr4 = str2.toUpperCase();
		System.out.println(lowerStr3);
		System.out.println(lowerStr4);
		System.out.println("-----------");
		System.out.println(str1.equals(lowerStr2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println("-----------");
	}
}