package chap05.lecture.array;

public class C05Array {
	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 1 };
		int[] arr2 = arr1;
		
		arr2[0] = 30;
		
		System.out.println(arr1[0]);
	}
}
