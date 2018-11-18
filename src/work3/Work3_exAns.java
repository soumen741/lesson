package work3;

public class Work3_exAns {
	public static void main(String[] args) {

		/*
		 * 次の要件を満たすプログラムを作成してください。
		 * ①整数型の配列(名前はなんでもいい)に80,75,100,90,80を格納して下さい
		 * ②その中で最大値と最小値を変数max,minに代入して、コンソールに出力してください。
		 *
		 */
		int num[] = { 80, 75, 100, 90, 80 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int number : num) {
			if (max < number) {
				max = number;
			}
			if (min > number) {
				min = number;
			}
		}
		System.out.println("最大値" + max);
		System.out.println("最小値" + min);

	}
}
