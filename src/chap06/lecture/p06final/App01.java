package chap06.lecture.p06final;

public class App01 {
	public static void main(String[] args) {
		// final : 변수 선언시 작성하면 값을 한번 할당할 수 있음
		int i = 0;
		i = 3;
		
		final int j = 0;
//		j = 1; //x
		
		final int k;
		k = 9;
//		k = 10;
		
		method1(3);
		method1(10);
	}
	
	public static void method1(final int i) {
//		i = 30; // 이미 호출할때 파라미터에서 값을 할당받았기때문에 할당 불가능
	}
}
