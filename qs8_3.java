package qs8;

/**
 * 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
 * 
 * @author yb
 *
 */
public class qs8_3 {

	public static void main(String[] args) {
		// 配列定義
		int[] arr = { 1, 2, 6, 7, 9, 6, 2, 8, 10 };
		int sum = 0;
		int avg = 0;
		// 配列のインデックス
		int max = arr[0];
		int min = arr[0];
		// forループ
		for (int i = 0; i < arr.length; i++) {
			// 配列の要素を比べる（インデックスを探す）
			if (arr[i] > max) {
				max = arr[i];
			}
			// 配列のインデックスを探す
			if (arr[i] < min) {
				min = arr[i];
			}
			// 合計を求める
			sum = sum + arr[i];
			// 平均値を求める
			avg = sum / arr.length;

		}
		// 出力
		System.out.println("配列のかつは" + sum);
		System.out.println("平均値は" + avg);
		System.out.println("最⼤値は" + max);
		System.out.println("最⼩値" + min);

	}

}
