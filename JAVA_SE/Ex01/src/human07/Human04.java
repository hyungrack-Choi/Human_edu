package human07;

public class Human04 {

	public static void main(String[] args) {
		//5장 7번무제 최대값 구하기
		int max = -9999;
		int[] arr = {1, 5, 3, 8, 2};
		
		for (int a = 0; a<arr.length; a++) {
			if(max < arr[a]) {
				max = arr[a];				
			}
		}
		System.out.printf("Max = %d \n", max);
	}
}