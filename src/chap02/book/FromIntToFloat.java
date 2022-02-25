package chap02.book;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
// num2가 num3에 할당될때 float type이라서 int값이 제대로 담기지않았기에 문제가 생겼다.
// 그래서 같은값을 뺐지만 0이아닌 중간과정의 문제로 -4가 출력됨