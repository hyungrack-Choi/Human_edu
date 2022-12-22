package human10;

public class Exam {

	public static void main(String[] args) {
		Student s1 = new Student("james", 500);
		Student s2 = new Student("tomas", 10000);
		
		Bus b1 = new Bus("100번", 0, 0);
		Bus b2 = new Bus("200번", 0, 0);

		
		
		
		Train t1 = new Train("1호선", 0, 0);
		Train t2 = new Train("2호선", 0, 0);
		
		System.out.printf 
		("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		
		System.out.printf 
		("%s버스는 승객이 %d명이고, 수입이 %d 입니다.\n"
				, b1.busNo, b1.passengerCnt, b1.income);
		System.out.println ("------------------------");
		
		s1.takeBus(b1);
		
		System.out.printf 
		("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		
		System.out.printf 
		("%s버스는 승객이 %d명이고, 수입이 %d 입니다.\n"
				, b1.busNo, b1.passengerCnt, b1.income);
		System.out.println ("------------------------");
		
		s2.takeTrain(t2);

		System.out.printf 
		("%s가 가지고 있는 돈 ==> %d \n", s1.name, s1.money);
		System.out.printf 
		("%s가 가지고 있는 돈 ==> %d \n", s2.name, s2.money);
		System.out.printf 
		("%s버스는 승객이 %d명이고, 수입이 %d 입니다.\n"
				, b1.busNo, b1.passengerCnt, b1.income);
		System.out.printf 
		("%s버스는 승객이 %d명이고, 수입이 %d 입니다.\n"
				, b2.busNo, b2.passengerCnt, b2.income);
		System.out.printf 
		("%s지하철은 승객이 %d명이고, 수입이 %d 입니다.\n"
				, t1.trainNo, t1.passengerCnt, t1.income);
		System.out.printf 
		("%s지하철은 승객이 %d명이고, 수입이 %d 입니다.\n"
				, t2.trainNo, t2.passengerCnt, t2.income);

		Student s3 = new Student("edward", 20000);
		Tax taxi1 = new Tax("잘나간다운수",0);
		System.out.println(taxi1.taxno + taxi1.income);
		s3.takeTax(taxi1);
		System.out.printf 
		("%s가 가지고 있는 돈 ==> %d \n", s3.name, s3.money);
		taxi1.showInfo();
		
		
	}
}
