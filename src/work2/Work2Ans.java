package work2;

import java.util.Scanner;

public class Work2Ans {
	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = 0;
		System.out.println("あなたの年齢を入力してください。");
		try {
			age = sc.nextInt();
		} catch (Exception e) {
			System.out.println("年齢は自然数を入力してください。");
		}
		sc.close();
		int fortuneNum = (int) (Math.random() * 100);
		if (fortuneNum >= 95) {
			fortuneNum = 1;
		} else if (fortuneNum > 95 && fortuneNum >= 65) {
			fortuneNum = 2;
		} else if (fortuneNum > 65 && fortuneNum >= 10) {
			fortuneNum = 3;
		} else {
			fortuneNum = 4;
		}
		String[] fortune = { "大吉", "中吉", "小吉", "凶" };
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運勢は" + fortune[fortuneNum - 1] + "です。");
	}
}
