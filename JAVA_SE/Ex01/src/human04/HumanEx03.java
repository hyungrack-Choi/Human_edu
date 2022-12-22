package human04;

public class HumanEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문으 활용하여 1~10까지 누적합 구하기.
		int total = 0;
		int index;	
		// for문 밖에서 index를 사용하는 부분이 있기 때뭔에 변수 선언은 for문 밖에서 선언
			for(index=0; index<=10; index = index + 1) {
				// index = 1; ==> 초기값을 설정
				// index<= 10 ==> 반복에 대한 조건.
				// index++	  ==> for문 마감시 저리하는
				total = total + index;
				System.out.printf("%d번재까지의 누적합 %d입니다. \n", index, total);
			}
		System.out.printf("index = %d \t , total = %d \n", index, total);
	}
	//break   조건문에서 빠져나오기
	//continue 조건문으로 이동

}
