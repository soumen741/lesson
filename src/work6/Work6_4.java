package work6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work6_4 {
	/*
	 * 自然数Nが与えられたとき、Nの数値だけ「*」を出力してください。
	 * (例)
	 * N = 3のとき　***
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("数字を入力してください");
		int num = Integer.parseInt(br.readLine());
		for (int i = 1; i <= num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
