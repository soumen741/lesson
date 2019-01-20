package work6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work6_5 {
	/*
	 * 投球数Nが与えられて、Nと同じ数だけ投球結果を表す文字列が与えられます。
	 * ストライクであれば「strike」、ボールであれば「ball」が与えられます。
	 * ストライクの時は「ストライク！」、ボールのときは「ボール！」と表示して、
	 * 3ストライクになった場合には「アウト！」、4ボールになった場合には「フォアボール！」と表示してください。
	 * アウトまたはフォアボールになった時点でそのあとの投球内容は表示しないこととします。
	 *
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を入力してください");
		int num = Integer.parseInt(br.readLine());
		for (int i = 1; i <= num; i++) {
			int result = (int) (Math.random() * 2);
			if (result == 1) {
				System.out.println("ストライク！");
			} else {
				System.out.println("ボール！");
			}
		}
	}
}
