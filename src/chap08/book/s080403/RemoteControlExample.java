package chap08.book.s080403;

import chap08.book.s080205.RemoteControl;
import chap08.book.s080301.Television;
import chap08.book.s080402.Audio;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}
