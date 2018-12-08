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
		message(calc(a, b));
		message(salt(a, b));
		message(luna(a, b));
		message(cell(a, b));
		message(gung(a, b));
		System.out.println("aとc");
		message(calc(a, c));
		message(salt(a, c));
		message(luna(a, c));
		message(cell(a, c));
		message(gung(a, c));
		System.out.println("aとd");
		message(calc(a, d));
		message(salt(a, d));
		message(luna(a, d));
		message(cell(a, d));
		message(gung(a, d));
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

	public static void message(int ans1,int ans2,int ans3,int ans4,int ans5) {
		if (ans1 > 0) {
			System.out.println("計算結果は" + ans1 + "です。");
		} else {
			System.out.println("エラー");
		}
		if (ans2 > 0) {
			System.out.println("計算結果は" + ans2 + "です。");
		} else {
			System.out.println("エラー");
		}if (ans3 > 0) {
			System.out.println("計算結果は" + ans3 + "です。");
		} else {
			System.out.println("エラー");
		}
		if (ans4 > 0) {
			System.out.println("計算結果は" + ans4 + "です。");
		} else {
			System.out.println("エラー");
		}
		if (ans5 > 0) {
			System.out.println("計算結果は" + ans5 + "です。");
		} else {
			System.out.println("エラー");
		}
	}
