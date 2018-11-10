package work3;

public class Work3_ex {
	public static void main(String[] args) {

		/*
		 * 次の要件を満たすプログラムを作成してください。
		 * ①整数型の配列(名前はなんでもいい)に80,75,100,90,80を格納して下さい
		 * ②その中で最大値と最小値を変数max,minに代入して、コンソールに出力してください。
		 *
		 */
		int[] aaa = new int[] { 80, 75, 100, 90, 80 };
		int max = aaa[2];
		int min = aaa[1];
		System.out.println(max);
		System.out.println(min);
	}
}
