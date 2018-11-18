package work5.example;

public class Example1 {
	//メソッド(関数)

	public static void main(String[] args) {
		/*
		 * それぞれの財布で
		 * 1. その商品が買えるか？
		 * 2. 買えた場合はお釣りいくらか？
		 */

		//商品の代金の変数
		int daikin1 = 150;
		int daikin2 = 300;

		//財布
		int wallet1 = 500;
		int wallet2 = 400;
		int wallet3 = 200;

		/*int wallet1BuyDaikin1Oturi = wallet1 - daikin1;
		int wallet1BuyDaikin2Oturi = wallet1 - daikin2;
		if (wallet1BuyDaikin1Oturi > 0) {
			System.out.println("財布１で商品１を買ったお釣りは" + wallet1BuyDaikin1Oturi);
		} else {
			System.out.println("財布１で商品１は買えません");
		}
		
		if (wallet1BuyDaikin2Oturi > 0) {
			System.out.println("財布１で商品2を買ったお釣りは" + wallet1BuyDaikin2Oturi);
		} else {
			System.out.println("財布１で商品2は買えません");
		}*/

		calc(wallet1, daikin1);

		System.out.println("財布１");
		message(calc(wallet1, daikin1));
		message(calc(wallet1, daikin2));
		System.out.println("財布２");
		message(calc(wallet2, daikin1));
		message(calc(wallet2, daikin2));
		System.out.println("財布３");
		message(calc(wallet3, daikin1));
		message(calc(wallet3, daikin2));

	}

	public static int calc(int wallet, int daikin) {
		int oturi = wallet - daikin;
		return oturi;
	}

	public static void message(int oturi) {
		if (oturi >= 0) {
			System.out.println("お釣りは" + oturi + "円です。");
		} else {
			System.out.println("お金が足りません。");
		}
	}

}
