package chap04.lecture.scanner;

import java.util.Scanner;

public class C03Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 값>");
		String str1 = scanner.nextLine();
		int num1 = Integer.valueOf(str1); //str타입이 숫자로 변경가능할 경우 숫자타입으로 변환시켜줌
		
		System.out.print("두번째 값>");
		String str2 = scanner.nextLine();
		int num2 = Integer.valueOf(str2);
		
		System.out.println(str1 + " + " + str2 + " = " + (str1 + str2));
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		scanner.close();
	}
}
