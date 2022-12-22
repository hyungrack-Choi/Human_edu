package human02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		// 초기용량이 10으로 설정된 default 리스트.
		List<String> list2 = new ArrayList<String>(100);
		// 초기용량이 100으로 설정된 리스트.
		List<String> list3 = Arrays.asList("a","b","c","d");
		// list3은 초기값이 정의된 List 컬렉션.
		// Arrays.asList는 수정이 불가함. 고정적으로 사용할 때만 사용가능. ==> 추가,삭제, 변경 불가. 검색만 가능.
		
		String str1 = list3.get(0);
		String str2 = list3.get(2);
		// get 메서드는 list안에 있는 데이터를 검색.
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(list3);
		System.out.println("------------------");
		
		list1.add("KANG");
		list1.add("HUMAN");
		list1.add("a");list1.add("a");list1.add("a");list1.add("a");list1.add("a");
		list1.add("a");list1.add("a");list1.add("a");list1.add("a");
		// list 컬렉션은 초기 용량보다 더 많은 add가 되면. 스스로 증량을 해주는 기능이 있음.
		System.out.println(list1);
		list1.clear();		// 리스트안의 데이터를 모두 삭제함.
		System.out.println(list1);

		list1.add("휴먼");
		list1.add("교육");
		list1.add("센터");
		boolean a1 = list1.add("휴먼");
		System.out.println(list1);
		System.out.println("a1 : " + a1);		
		list1.add(1, "영등포");	
		//add에 인덱스를 추가할 경우 인덱스 위치에 내용을 추가하고, 뒤의 내용은 한칸씩 미룬다
		System.out.println(list1);
		String isSet = list1.set(1, "천안"); 
		// set은 특정위치에 데이터를 변경함. 되돌려준 값은 변경이전의 값을 되돌려줌.
		System.out.println(list1);
		System.out.println ("isSet : " + isSet);	//  isSet : 영등포.
		
		boolean isE1 = list1.isEmpty();
		// list1이 비어 있으면 true, 비어있지 않으면 false
		System.out.println ("list1.isEmpty() ==> " + isE1);
		boolean isE2 = list2.isEmpty();
		System.out.println ("list2.isEmpty() ==> " + isE2);
		int list1Length = list1.size();
		System.out.println ("list1.length ==> " + list1Length);

 		String remove4 = list1.remove(4);	
 		// list의 인덱스 위치에서 객체를 삭제함. 되돌려주는 값은 지워진 값
		System.out.println(list1);
		System.out.println ("remove4 : " + remove4);
		boolean isRemove1 = list1.remove("천안");
		System.out.println(list1);
		System.out.println("isRemove1 : " + isRemove1);
		

	}

}
