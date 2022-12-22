package human25;

public class Getmax2 {

	public static void main(String[] args) {

		int[] array1 = {5,4,9,10,3,7};
		int getMax = getMax(array1);
		System.out.printf("Max = %d \n", getMax);

		int[] array2 = {1,4,9,19,3,7};
		getMax = getMax(array2);;
		System.out.printf("Max = %d \n", getMax);
	}

	private static int getMax(int[] array) {
		//int[] array = array1;
		int max = -99;
		
		for (int a=0; a<array.length; a++) {
			if(max < array[a]) {
				max = array[a];
			}
		}
		return max;
	}
}