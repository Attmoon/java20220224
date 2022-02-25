package chap02.book;

public class FromInToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}

//double은 int의 모든값을 수용할수있기에 정상적으로 중간과정을거쳐 0이 출력됨