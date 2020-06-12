package pet;

class Pet {
	public String type;
	public String name;
}

/*petClientクラス(petクラスを呼び出して利用するクラス)*/
public class PetClient{
	public static void main(String[] args) {
		Pet dog = new Pet();
		Pet cat = new Pet();

		dog.type = "犬";
		dog.name = "ポチ";
		System.out.println("ペットの種類は" + dog.type + "、名前は" + dog.name +"です");

		cat.type = "猫";
		cat.name = "たま";
		System.out.println("ペットの種類は" + cat.type + "、名前は" + cat.name +"です");
	}
}
