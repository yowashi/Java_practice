package pet;

class Pet {
	private String type;
	private String name;

	/*Setter & Getter*/
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

/*petClientクラス(petクラスを呼び出して利用するクラス)*/
public class PetClient{
	public static void main(String[] args) {
		Pet dog = new Pet();
		Pet cat = new Pet();

		dog.setType("犬");
		dog.setName("ポチ");
		System.out.println("ペットの種類は" + dog.getType() + "、名前は" + dog.getName() +"です");

		cat.setType("猫");
		cat.setName("たま");
		System.out.println("ペットの種類は" + cat.getType() + "、名前は" + cat.getName() +"です");
	}
}
