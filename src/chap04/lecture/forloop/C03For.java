package chap04.lecture.forloop;

public class C03For {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		
		int i; //for문 종료후에도 사용하기를 원할때 for문 이전에 선언하면됨
		for (i = 0; i <5; i++) {
			System.out.println(i);
		}
		System.out.println(i); //x
	}
}
