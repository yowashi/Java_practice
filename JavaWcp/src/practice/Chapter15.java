package practice;

public class Chapter15 {
	public static void main(String[] args) {
		int a = 976;
		int b = 427;
		System.out.println(a + "と" + b + "の最大公約数" + gcb(a, b) + "です");
	}

	static int gcb(int a, int b) {
		if ( b == 0) {
			return a;
		}
		return gcb(b, a % b);
	}
}
