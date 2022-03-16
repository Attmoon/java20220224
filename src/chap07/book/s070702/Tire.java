package chap07.book.s070702;

public class Tire {
	// 필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	// 생성자
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "Ture 펑크 ***");
			return false;
		}
	}
}
