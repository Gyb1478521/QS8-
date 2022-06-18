package qs8;

/**
 * 質問５︓質問３の配列に値「７」のインデックスを求む。
 * 
 * @author yb
 *
 */
public class qs8_5 {

	public static void main(String[] args) {
		// 配列定義
		int[] arr = { 1, 2, 6, 7, 9, 6, 2, 8 };
		// forループ
		for (int i = 0; i < arr.length - 1; i++) {
			// 配列のインデックスを探す
			if (arr[i] == 7) {
				// 出力
				System.out.println(i);
			}

		}
	}
}
