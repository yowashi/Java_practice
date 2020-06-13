package pet;

class Pet {
	private String type;
	private String name;
	private final String message = "はじめまして";

	Pet(String type, String name){
		this.setType(type);
		this.setName(name);
	}

	void greet() {
		System.out.println(message);
		System.out.println("僕は" + this.getType() + "の" + this.getName() + "です");
	}
	/*Setter & Getter*/
	String getType() {
		return this.type;
	}
	void setType(String type) {
		this.type = type;
	}
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name = name;
	}

}

/*petClientクラス(petクラスを呼び出して利用するクラス)*/
public class PetClient{
	public static void main(String[] args) {
		Pet pet = new Pet("犬","ぽち");
		pet.greet();
	}
}
