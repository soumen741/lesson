package work6;

public class Work6_1 {
	/*
	 * ある自然数aとbがあります。
	 * aとbを比較して大きいほうの値を出力してください。
	 * 同じ値の場合は「eq」と出力して下さい。
	 */
	public static void main(String[] args) {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		if (a > b) {
			System.out.println(a);
		}
		if (a < b) {
			System.out.println(b);
		} else {
			System.out.println("eg");
		}
	}
}
