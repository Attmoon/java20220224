package chap06.lecture.p11annotation;

public class App06 {
	
	@MyAnnotation6(value = "spring")
	void method() {
		
	}
	
	@MyAnnotation6("java") // value는 element명 생략가능
	void method2() {
		
	}
}
