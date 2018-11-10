package work3;

public class Work3_3Ans {

	public static void main(String[] args) {
		int seibetu = 1;
		int age = 20;
		System.out.println("こんにちは。");
		if (seibetu == 0) {
			System.out.println("私は男です。");
			System.out.println(age + "歳です。");
		} else {
			System.out.println("私は女です。");
		}
		// 冗長性→同じことを何回も言わない
		// DRY(Don't Repeat Yourself)の原則
		System.out.println("よろしくおねがいします。");
	}

}
