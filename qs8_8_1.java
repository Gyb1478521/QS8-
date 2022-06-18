package qs8;

/**
 * 質問８︓LV10のパスカルの三⾓形を出⼒してください。
 * 
 * @author yb
 *
 */
public class qs8_8_1 {

	public static void main(String[] args) {
		// 変数定義
		int arr[][] = new int[10][10];
		arr[0][0] = 1;
		// ループ
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				// 条件判定
				if (j == 0 || j == i) {

					arr[i][j] = 1;
					System.out.println();
				} else {
					
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];

				}
				// 出力
				System.out.print(arr[i][j]);

			}
		}
		System.out.println();

	}

}
