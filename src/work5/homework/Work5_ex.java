package work5.homework;

public class Work5_ex {
	/*
	 * 次の要件を満たすプログラムを作成しなさい。
	 * ただし、各計算を行うメソッドをそれぞれ作り、メッセージを出力するメソッドも作成すること。
	 *
	 * 1. int型変数を4つ(a,b,c,d)用意する。値はなんでもいい
	 * 2. a+b,a+c,a+d,a-b,a-c,a-d,a*b,a*c,a*d,a/b,a/c,a/d,a%b,a%c,a%dの計算を行う
	 * 3. 2の計算結果が正の場合は計算結果を、0の場合と負の場合はエラーを出力する。
	 *
	 *
	 */

	public static void main(String[] args) {
		int a = 10;
		int b = 8;
		int c = 11;
		int d = 5;
		calc(a, b);

		System.out.println("aとb");
		message1(calc(a, b));
		message2(salt(a, b));
		message3(luna(a, b));
		message4(cell(a, b));
		message5(gung(a, b));
		System.out.println("aとc");
		message1(calc(a, c));
		message2(salt(a, c));
		message3(luna(a, c));
		message4(cell(a, c));
		message5(gung(a, c));
		System.out.println("aとd");
		message1(calc(a, d));
		message2(salt(a, d));
		message3(luna(a, d));
		message4(cell(a, d));
		message5(gung(a, d));
	}

	public static int calc(int x, int y) {
		int ans1 = x + y;
		return ans1;
	}

	public static int salt(int x, int y) {
		int ans2 = x - y;
		return ans2;
	}

	public static int luna(int x, int y) {
		int ans3 = x * y;
		return ans3;
	}

	public static int cell(int x, int y) {
		int ans4 = x / y;
		return ans4;
	}

	public static int gung(int x, int y) {
		int ans5 = x % y;
		return ans5;
	}

	public static void message1(int ans1) {
		if (ans1 > 0) {
			System.out.println("計算結果は" + ans1 + "です。");
		} else {
			System.out.println("エラー");
		}
	}

	public static void message2(int ans2) {
		if (ans2 > 0) {
			System.out.println("計算結果は" + ans2 + "です。");
		} else {
			System.out.println("エラー");
		}
	}

	public static void message3(int ans3) {
		if (ans3 > 0) {
			System.out.println("計算結果は" + ans3 + "です。");
		} else {
			System.out.println("エラー");
		}
	}

	public static void message4(int ans4) {
		if (ans4 > 0) {
			System.out.println("計算結果は" + ans4 + "です。");
		} else {
			System.out.println("エラー");
		}
	}

	public static void message5(int ans5) {
		if (ans5 > 0) {
			System.out.println("計算結果は" + ans5 + "です。");
		} else {
			System.out.println("エラー");
		}
	}
}