package work4;

import java.util.Scanner;

public class Work4_4Ans {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = { 3, 4, 9 };
		System.out.println("1桁の数字を入力してください");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input < 10 && input >= 0) {
			boolean flg = false;
			for (int k : numbers) {
				if (k == input) {
					flg = true;
					break;
				}
			}
			if (flg) {
				System.out.println("アタリ！");
			} else {
				System.out.println("ハズレ！");
			}
		} else {
			System.out.println("エラー！");
		}
		sc.close();
	}

}
