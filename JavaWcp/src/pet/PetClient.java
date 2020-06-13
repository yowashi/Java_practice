package pet;

import java.io.Console;

//FriendlyPetのクラス
class FriendlyPet extends Pet {
	FriendlyPet(String type, String name){
		super(type, name);
	}
	void greet() {
		super.greet();
		System.out.println("何か話しかけてみて");
		talk();
	}
	void talk() {
		Console console = System.console();
		String words = console.readLine();
		System.out.println(words + "っ言った?");
		System.out.println("おもしろいこというね");
	}
}
	class Pet{
		protected String type;
		protected String name;
		protected static String message = "はじめまして";

		Pet(String type, String name){
			this.setType(type);
			this.setName(name);
		}
	void greet() {
		System.out.println(message);
		System.out.println("僕は" + this.getType() + "の" + this.getName() +"です");
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
		FriendlyPet pet = new FriendlyPet("犬","ぽち");
		pet.greet();
	}
}
