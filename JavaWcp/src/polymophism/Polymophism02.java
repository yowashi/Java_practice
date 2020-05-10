package polymophism;

import polymophism.human.Human;
import polymophism.human.Student;

public class Polymophism02 {
	public static void main(String [] args) {
		Human human  = new Student("佐藤", 17, 70);

		Polymophism02 polymophism = new Polymophism02();

		polymophism.printName();
		polymophism.printName("松本");
		polymophism.printName("松本","清水");
		polymophism.printName(human);
	}

	public void printName() {
		System.out.println("中川です");
	}
	public void printName(String name) {
		System.out.println(name + "です。");
	}

	public void printName(String name1, String name2) {
		System.out.println(name1 + "と" + name2 + "です。");
	}

	public void printName(Human human) {
		System.out.println(human.getName() + "です。");
	}
}
