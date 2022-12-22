package human01;

public class TVExam {

	public static void main(String[] args) {

//	RemoteControl rc = new Television();
	Television tv = new Television();
	RemoteControl rc = tv;
	//rc는 구현객체이고, Television는 구현클래스의 객체
	rc.turnOn();
	rc.setVolume(5);
	rc.setMute(false);//무음해제
	rc.setVolume(RemoteControl.MIN_VOL);
	//RemoteControl.MIN_VOL == >0
	//그래서 rc.setVolume(0)과 같은 동작을 함.
	rc.turnOFF();
	RemoteControl.changeBatt();
	System.out.println("-----------------");
	Audio au = new Audio();
	RemoteControl rc2 = au;
	//rc는 구현객체이고, Television는 구현클래스의 객체
	rc2.turnOn();
	rc2.setVolume(5);
	rc2.setMute(false);//무음해제
	rc2.setVolume(RemoteControl.MIN_VOL);
	//RemoteControl.MIN_VOL == >0
	//그래서 rc.setVolume(0)과 같은 동작을 함.
	rc2.turnOFF();
	RemoteControl.changeBatt();
	}
}