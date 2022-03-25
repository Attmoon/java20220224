package chap14.lecture.p01lamda;

public class App07 {
	public static void main(String[] args) {
//		args = null; // final 또는 effectively final
		MyInterface7 o1 = () -> System.out.println(args.length);
	}
}

@FunctionalInterface
interface MyInterface7 {
	void method();
}