package chap09.lecture.p01nested;

public class MyClass7 {
	void method1(final int param) {
		// 지역클래스에서 지역변수(파라미터) 사용시 주의해야 할 점
		// 지역변수(파라미터)는 final이어야 사용가능
		// 단, 값이 변경되지 않으면 생략가능 (effectively final)
//		final int i = 3;
		int i = 3;
		
		class LocalClass1 {
			void method2() {
				System.out.println(i);
			}
			
			void method4() {
				System.out.println(param);
//				param = 4;
			}
		}
	}
}
