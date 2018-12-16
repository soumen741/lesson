package work6;

public class Work6_2 {
	/*
	 * 自然数Nがある。
	 * Nが奇数のとき「odd」、偶数のとき「even」
	 * と出力して下さい。
	 */
	public static void main(String[] args) {
		int N = (int) (Math.random() * 100);
		if (N % 2 <= 0) {
			System.out.println("even");
		} else
			System.out.println("odd");
	}

}
