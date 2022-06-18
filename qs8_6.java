package qs8;

/**
 * 質問６︓任意⾏列（２次元配列）の積を求める。
 * 
 * @author yb
 *
 */
public class qs8_6 {

	public static void main(String[] args) {
		int count = 1;
		// 配列定義
		int[][] arr2d = new int[][] { { 1, 2, 6, 7, 9, 6, 2, 8 }, { 2, 3, 4, 5, 6, 7, 8, 8 } };
		// forループ
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				count = count * arr2d[i][j];

			}
		}
		// 出力
		System.out.print(count);
	}

}
