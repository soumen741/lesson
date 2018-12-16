package work5.homework;

import java.util.ArrayList;
import java.util.List;

public class Work5_exAns {

	public static void main(String[] args) {
		int a = 10;
		int b = 8;
		int c = 11;
		int d = 5;
		int[] hairetu = { a, b, c, d };
		message(calc(hairetu));

	}

	public static List<Integer> calc(int[] num) {
		List<Integer> ans = new ArrayList<>();
		for (int i = 1; i < num.length; i++) {
			int sum = num[0] + num[i];
			int deg = num[0] - num[i];
			int kake = num[0] * num[i];
			int waru = num[0] / num[i];
			int amari = num[0] % num[i];

			ans.add(sum);
			ans.add(deg);
			ans.add(kake);
			ans.add(waru);
			ans.add(amari);
		}
		return ans;
	}

	public static void message(List<Integer> ans) {
		for (int i = 0; i < ans.size(); i++) {
			if (i == 0) {
				System.out.println("aとb");
			} else if (i == 5) {
				System.out.println("aとc");
			} else if (i == 10) {
				System.out.println("aとd");
			}
			if (ans.get(i) > 0) {
				System.out.println("計算結果は" + ans.get(i) + "です。");
			} else {
				System.out.println("エラーです。");
			}
		}
	}

}
