package work4;

import java.util.Scanner;

public class Work4_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = { 3, 4, 9 };
		System.out.println("1桁の数字を入力してください");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int k : numbers) {
			if (k == input) {
				System.out.println("アタリ！");
			}
		}
		sc.close();
	}

}
