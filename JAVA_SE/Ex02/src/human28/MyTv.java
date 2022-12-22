package human28;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 1;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
//		if(this.isPowerOn = true){
//			this.isPowerOn = false;
//		}else {
//			this.isPowerOn = true;
//		}
		this.isPowerOn = ! this.isPowerOn;
		//boolean형태는 true/false 2가지만 있기 때문에
		//NOT의 연산자를 처리할 수 있다.
	}	
	void volumeUp() {
		//볼륨 1증가, 단 MaxVolume 내에서만
		if(this.volume < this.MAX_VOLUME) {
			this.volume ++;
		}
	}
	void volumeDown() {
		//볼륨 1감소, 단 MaxVolume 내에서만
		if(this.volume > this.MIN_VOLUME) {
			this.volume --;
		}
	}	
	void channelUp() {
		//채널1증가 . MaxChannel 내에서만
		//MAX_CHANNEL에서 1증가 할 경우에는 Min_CHANNEL로 변경
		//MAX_CHANNEL(100) / MIN CHANNEL(1)
		
		if(this.channel == this.MAX_CHANNEL) {
			this.channel =  this.MIN_CHANNEL;
		}
		else{
			this.channel++;
		}
	}	
	void channelDown() {
		if(this.channel == this.MIN_CHANNEL) {
			this.channel =  this.MAX_CHANNEL;
		}
		else {
			this.channel--;
		}
	}
}