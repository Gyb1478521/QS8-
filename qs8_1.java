package qs8;

/**
 * 1から100までの偶数と奇数の和を求める(for + if)。
 * 
 * @author yb
 *
 */
public class qs8_1 {

	public static void main(String[] args) {
		// 定義変数
		int sum = 0;
		int odd = 0;
		// forループ０から１００までループする。
		for (int i = 0; i <= 100; i++) {
			// 条件判定
			if (i % 2 == 0) {
				sum = sum + i;

			} else if (i % 2 != 0) {
				odd = odd + i;
			}

		}
		// 出力する。
		System.out.println(sum);
		System.out.println(odd);
	}

}
