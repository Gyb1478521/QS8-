package qs8;

/**
 * 質問７︓配列を昇順でソートする （java.util等メソッド利⽤禁⽌）。
 * 
 * @author yb
 *
 */
public class qs8_7 {

	public static void main(String[] args) {
		// データを転換するため、変数を定義します
		int b = 0;

		int[] arr = new int[] { 3, 2, 4, 7, 8, 6, 9, 1, 10 };
		// ループ比べる
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				// 条件判定
				if (arr[j] > arr[j + 1]) {
					b = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = b;

				}

			}

		} // 设置一个变数用来取出 数组arr里的所有元素
			// 変数を設置したら、配列arrの中の要素を取得します。
		for (int x : arr) {
			System.out.print(x);
		}

	}

//		int b = 0;
//		int[] arr = new int[] { 3, 2, 1 };
//		for (int i = 0; i < arr.length -1; i++) {
//			for(int j = 0 ; j < arr.length ; j ++ ) {
//				for(int z = 0 ; z <arr.length  ;z ++ ) {
//			if (arr[i] > arr[i + 1]) {
//				b = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = b;
//			}
//		}
//		for (int x : arr) {
//			System.out.println(x);
//		}
//			}
//	}
//	}
}
