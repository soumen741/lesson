package work3;

public class Work3_ex {
	public static void main(String[] args) {

		/*
		 * 次の要件を満たすプログラムを作成してください。
		 * ①整数型の配列(名前はなんでもいい)に80,75,100,90,80を格納して下さい
		 * ②その中で最大値と最小値を変数max,minに代入して、コンソールに出力してください。
		 *
		 * Hint
		 * 1. for文を使う
		 * 2. if文も使う
		 *
		 */
		int max = 0;
		int min = 100;
		int[] aaa = new int[] { 80, 75, 100, 90, 80 };
		for (int i = 0; i < aaa.length; i++) {
			if (aaa[i] > max)
				max = aaa[i];
			if (aaa[i] < min)
				min = aaa[i];
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);

	}
}
