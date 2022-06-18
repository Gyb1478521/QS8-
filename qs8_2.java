package qs8;

/**
 * 設問２︓5の階乗を求める(for)。
 * 
 * @author yb
 *
 */
public class qs8_2 {

	public static void main(String[] args) {
		// 定義変数
		int fact = 1;
		// forループ、階乗ですから、５から１までかけざんします。
		for (int i = 5; i >= 1; i--) {
			fact = fact * i;

		}
		// 出力
		System.out.println("5*4*3*2*1 = " + fact);

	}

}
