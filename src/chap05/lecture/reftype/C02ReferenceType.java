package chap05.lecture.reftype;

public class C02ReferenceType {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("java");

		System.out.println(s1 == s2);

		int i1 = 3;
		int i2 = 5;

		System.out.println(i1 == i2);
	}
}
