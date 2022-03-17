package chap08.book.s080203;

public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메소드
	public void turnOn();
	public void TurnOff();
	public void setVolume(int volume);
}
