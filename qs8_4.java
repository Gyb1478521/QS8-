package qs8;

/**
 * 質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
 * 
 * @author yb
 *
 */
public class qs8_4 {

	public static void main(String[] args) {
		// 配列定義
		int[] arr = { 1, 2, 6, 3, 9, 6, 2, 8 };
		// パラメータを定義
		int repeat = 0;
		int repeatwo = 0;
		int sum = 0;
		// forループ
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				// 重複の個数
				repeat = repeat + 1;

			} else if (arr[i] == 6) {
				repeatwo = repeatwo + 1;

			}
			// 重複の個数のsum値
			sum = repeat + repeatwo;
		}
		System.out.println("重複の個数は" + sum + "個です。");
		
		

	}

}
