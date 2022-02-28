package practice;

public class C01practice {
	public static void main(String[] args) {
		byte b1 = 120;
		short s1 = 30000;
		
		byte b2;
		
		b2 = (byte) s1; // 강제 형변환 (type casting)
		System.out.println(b2);
	}
}
