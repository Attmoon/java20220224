package chap03.book;

public class OverflowExample {
	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		long z = x * y;   //int를 쓰면 int의 최대값을 넘겨서 overflow되지만 long을 사용함으로써 해결됨
		System.out.println(z);
	}
}
