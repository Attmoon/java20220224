package chap04.book.Exercise;

public class Exercise06 {
	public static void main(String[] args) {
		String star = "*";
		
		for (int i = 0; i < 5; i++) {
			System.out.println(star);
			star += "*";
		}
		System.out.println("출력 (끝에 enter 없이)");
		
		System.out.print("출력 1");
		System.out.print("출력 2");
		System.out.println(); //그냥 다음 줄
		System.out.print("출력 3");
		System.out.println("출력4");
		System.out.println("출력5");
		
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i+1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
