package polymophism.human;

public class Human {
	private String name;
	protected int age;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}
	public int getAge(){
		return this.age;
	}

	public String getProfile() {
		return "名前は" + this.name + "年齢は" + this.age + "です。";
	}
}
