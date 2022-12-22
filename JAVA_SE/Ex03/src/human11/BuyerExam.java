package human11;

public class BuyerExam {

	public static void main(String[] args) {
		//데이터 입력
		int tvPrice = 100;
		int computerPrice = 200;
		int audioPrice = 50;
		//데이터 처리
		Tv tv = new Tv(tvPrice, "TV");
		Computer computer 
			= new Computer
			(computerPrice, "COMPUTER");
		Audio audio = new Audio
				(audioPrice, "AUDIO");
		Buyer buyer1 = new Buyer(1000);

		buyer1.buy(tv);
		buyer1.buy(computer);
		buyer1.buy(tv);
		buyer1.buy(audio);
		buyer1.buy(computer);
		buyer1.buy(computer);
		buyer1.buy(tv);
		buyer1.buy(audio);
		buyer1.buy(computer);
		buyer1.buy(computer);
		buyer1.buy(tv);
		//데이터 결과
		buyer1.summary();
		System.out.println("-----------------");
		
		Buyer buyer2 = new Buyer(500);
		buyer2.buy(tv);
		buyer2.buy(computer);
		buyer2.buy(tv);
		buyer2.buy(computer);
		buyer2.summary();
	}
}