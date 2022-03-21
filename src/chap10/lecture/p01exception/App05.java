package chap10.lecture.p01exception;

public class App05 {
	public static void main(String[] args) {
		// ArithmeticException
		
		int i = 5;
		int j = 0;
		
		if(j != 0) { // if else로 exception 처리 가능
			System.out.println(i / j); // ArithmeticException
		}
		
		
		System.out.println("프로그램 실행 계속...");
	}
}
