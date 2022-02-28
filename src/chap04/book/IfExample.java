package chap04.book;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}

		if (score < 90)
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B 입니다."); // 중괄호 생략하면 if바로 아래코드만 적용되므로 이코드는 if문과 무관한 코드임
	}
}
