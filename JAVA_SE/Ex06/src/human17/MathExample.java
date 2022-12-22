package human17;

public class MathExample {

	public static void main(String[] args) {

		int v1 = Math.abs(-5);				//절대값
		double v2 = Math.abs(-3.14);
		System.out.println("V1 : "+ v1);
		System.out.println("V2 : "+ v2);
		
		double v3 = Math.ceil(5.3);			//올림값 ==> 6.0
		double v4 = Math.ceil(-5.3);		//올림값 ==> -5.0
		System.out.println("V3="+ v3);
		System.out.println("V4="+ v4);
		
		double v5 = Math.floor(5.3);		//내림값 ==> 5.0
		double v6 = Math.floor(-5.3);		//내림값 ==> -6.0
		System.out.println("V5="+ v5);
		System.out.println("V6="+ v6);
		
		int v7 = Math.max(5,9);				//2개의 수 중 큰수
		double v8 = Math.max(5.3,2.5);		//2개의 수중 큰수
		System.out.println("V7="+ v7);
		System.out.println("V8="+ v8);
		
		int v9 = Math.min(5,9);				//2개의 수 중 작은 수
		double v10 = Math.min(5.0,9.0);		//2개의 수중 작은 수
		System.out.println("V9="+ v9);
		System.out.println("V10="+ v10);
		
		double v11= Math.random();
		System.out.println("v11="+ v11);
		
		double v12 = Math.rint(5.3);		//정수에 가까운 실수값(반올림 실수값. 단 소수점은 모두0)
		double v13 = Math.rint(5.7);		//정수에 가까운 실수값(반올림 실수값. 단 소수점은 모두0)
		System.out.println("V12="+ v12);
		System.out.println("V13="+ v13);
		
		
		double v14 = Math.rint(5.3);		//정수에 가까운 실수값(반올림 실수값. 단 소수점은 모두0)
		double v15 = Math.rint(5.7);		//정수에 가까운 실수값(반올림 실수값. 단 소수점은 모두0)
		System.out.println("V14="+ v14);
		System.out.println("V15="+ v15);
		
		//12.3456이란 숫자가 있는데. 소수점 2번째잘이ㅔ서 반올림하고 싶다.
		double value = 12.3456;
		//value *100을 함 ==>round를 통해서 반올림 . ==>100.0으로 나눔
		double temp1 = value *100;
		long temp2 = Math.round(temp1);
		double v16 = temp2 / 100.0;
		System.out.println("v16 : "+ v16);
	}
}