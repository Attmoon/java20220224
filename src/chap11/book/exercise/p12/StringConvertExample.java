package chap11.book.exercise.p12;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
				
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		String strData3 = Integer.toString(intData2);
	}
}
