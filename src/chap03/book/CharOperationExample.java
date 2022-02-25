package chap03.book;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1;   //컴파일 에러 c2가 int로 변환돼서 합산되므로 char타입으로 casting해줘야함
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		//System.out.println("c3:" + c3);
	}
}
