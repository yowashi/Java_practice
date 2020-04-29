
public class Chapter07 {
	public static void main(String[] args) {
		int lunchMoney = 500;
		if (lunchMoney >= 800) {
			System.out.println("チャーシュー麺が食べられます");
		}else if (lunchMoney > 600) {
			System.out.println("ラーメンが食べられます");
		}else {
			System.out.println("どのラーメンも食べられません");
		}
	}
}
