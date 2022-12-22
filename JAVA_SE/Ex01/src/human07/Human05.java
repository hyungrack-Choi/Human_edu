package human07;

public class Human05 {

	public static void main(String[] args) {

		// 5장 7번 최소값 구하기
		int min = 9999;
		int[] arr = {5, 3, 8, 1, 2,9,10,29,};
		
		for (int a = 0; a<arr.length; a++) {
			if(arr[a] < min) {
				min = arr[a];
			}
		}
		System.out.printf("Min = %d \n", min);
	}
}
