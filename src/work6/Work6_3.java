package work6;

public class Work6_3 {
	/*
	 * 2つの西暦a,bがある。
	 * aとbが何年間あるか出力してください。
	 *
	 */
	public static void main(String[] args) {
		System.out.println("西暦aを入力してください");
		int year1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("西暦bを入力してください");
		int year2 = new java.util.Scanner(System.in).nextInt();
		if (year1 >= year2) {
			System.out.println(year1 - year2);
		} else {
			System.out.println(year2 - year1);
		}
	}
}
