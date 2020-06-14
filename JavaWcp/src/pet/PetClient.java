package pet;

import java.io.Console;

//FriendlyPetのクラス
class FriendlyPet {
	private Pet pet;

	FriendlyPet(String type,String name){
		pet = new Pet(type, name);
	}
	void greet() {
		pet.greet();
		System.out.println("何か話しかけてみて");
		talk();
	}
	void talk() {
		Console console = System.console();
		String words = console.readLine();
		System.out.println(words + "っ言った?");
		System.out.println("おもしろいこというね");
	}

	/*Setter & Getter*/
	String getType() {
		return pet.getType();
	}
	void setType(String type) {
		pet.setType(type);
	}
	String getName() {
		return pet.getName();
	}
	void setName(String name) {
		pet.setName(name);
	}
}
	class Pet{
		private String type;
		private String name;
		private static String message = "はじめまして";

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
		FriendlyPet dog = new FriendlyPet("犬","ぽち");
		dog.greet();
	}
}
