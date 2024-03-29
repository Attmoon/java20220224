package chap02.lecture;

public class C11TypeConversion {
	public static void main(String[] args) {
		// 정수 <-> 실수
		int i1 = 21_0000_0000;
		double d1 = 2100000000.12345;
		
		int i2;
		double d2;
		
		//정수 -> 실수 : 자동 형변환
		i2 = i1;
		d2 = i1; //ok d가 i보다 넓은 실수이기때문에
		System.out.println(i2);
		System.out.println(d2);
		
		//실수 -> 정수 : 강제 형변환
		i2 = (int) d1; // type casting
		d2 = d1;
		System.out.println(i2);
		System.out.println(d2);
	}
}
