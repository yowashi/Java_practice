package text_practice;

public class lesson04 {
	public static void main(String[] args) {
		int x, y;
		x = 10;
		y = 3;

		java.awt.Point point = new java.awt.Point();
		point.setLocation(x, y);

		System.out.println("x, y座標をフィールドで参照します(int)");
		System.out.println("x座標:" + point.x);
		System.out.println("y座標:" + point.y);

		System.out.println("x, y座標をgetメソッドで参照します(double)");
		System.out.println("x座標:" + point.getX());
		System.out.println("y座標:" + point.getY());
	}
}
