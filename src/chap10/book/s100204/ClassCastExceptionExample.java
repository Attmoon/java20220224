package chap10.book.s100204;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal aniaml) {
		// if(animal instanceof Dog) {
			Dog dog = (Dog) aniaml;
		//}
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
