package chap13.book.exercise.p03;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();

		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set2("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
	}
}

class Container<T, U> {
	private T field1;
	private U field2;

	public void set(T param, U param2) {
		field1 = param;
		field2 = param2;
	}

	public void set2(T string, U i) {
		field1 = string;
		field2 = i;
	}

	public T getKey() {

		return field1;
	}

	public U getValue() {

		return field2;
	}

}