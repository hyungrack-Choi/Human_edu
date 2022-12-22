package human16;

import java.util.Arrays;

public class SortExam {

	public static void main(String[] args) {

		int[] score = {99,97,98};
		Arrays.sort(score);
		for (int i = 0; i < score.length; i++) {
			System.out.printf("scores[%d] = %d \n", i, score[i]);
		}
		System.out.println("----------------");
		String[] names = {"홍길동","박동수", "김민수"};
		Arrays.sort(names);
		//String도 오름차순 정렬
		//Arrays.sort(names,Collections.reverseOrder());
		//내림차순을 위해서는 Collections.reverseOrder() 내용을 추가함.
		for (int i = 0; i < names.length; i++) {
			System.out.printf("names[%d] = %s \n", i,names[i]);
		}
		System.out.println("----------------");
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		
		Member[] members = {m1,m2,m3};
		Arrays.sort(members);
		// m1.compareTo(m2)
		for (int i = 0; i < members.length; i++) {
			System.out.printf("Members[%d] = %s \n", i, members[i].name);
		}
	}
}