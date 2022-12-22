package human07;

public class Human08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min, sum;
		int [] arr1 = {1,5,3,8,2,4};
		
		max = searchMax(arr1);
		min = searchMin(arr1);
		sum = dosum(arr1);
		System.out.printf("MAX = %d \n", max);
		System.out.printf("MIN = %d \n", min);
		System.out.printf("SUM = %d \n", sum);

		int [] arr2 = {10,20,5,30,1,-99,100};
		max = searchMax(arr2);
		min = searchMin(arr2);
		sum = dosum(arr2);
		System.out.printf("MAX = %d \n", max);
		System.out.printf("MIN = %d \n", min);
		System.out.printf("SUM = %d \n", sum);		
	}

	private static int searchMin(int[] arr) {

		int min = +9999;
		
		for (int a = 0; a<arr.length; a++) {
			if(min > arr[a]) {
				min = arr[a];				
			}
		}		
		return min;
	}

	private static int searchMax(int[] arr) {
		
		int max = -9999;
		
		for (int a = 0; a<arr.length; a++) {
			if(max < arr[a]) {
				max = arr[a];				
			}
		}		
		return max;
	}
	private static int dosum(int[] arr) {
		
		int sum = 0;
		
		//for (int a = 0; a<arr.length; a++) {
		//	sum = sum+arr[a];				
		//}
		for (int arrValue : arr) { // arr={1,5,3,8,2}
			sum = sum + arrValue;
		}
		return sum;
	}
}
