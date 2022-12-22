package human07;

public class Human06 {

	public static void main(String[] args) {
		//연습문제 5장 8번문제
		int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88,90}
		};
		
		int sum = 0;
		int count = 0;
		double avg = 0.0;

		System.out.println("array.length : " + array.length);
		System.out.println("array[0].length: " + array[0].length);
		System.out.println("array[1].length: " + array[1].length);
		System.out.println("array[2].length: " + array[2].length);

		System.out.println("array[0][0].length = " + array[0][0]);
		System.out.println("array[2][4].length = " + array[2][4]);
		System.out.println("array[1][2].length = "  + array[1][2]);
			
		 for(int a=0; a<array.length; a++) { 
			 for(int b=0; b<array[a].length; b++) {
				 sum = sum + array[a][b];
				 count++;
			 }
//			 count = count / array[a].length;
		 } 
		 avg = sum / count;

		System.out.println("count: " + count);
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
