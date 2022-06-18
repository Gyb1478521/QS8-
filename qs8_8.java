package qs8;

/**
 * 質問８︓LV10の三⾓形を出⼒してください。
 * 
 * @author yb
 *
 */
public class qs8_8 {

	public static void main(String[] args) {
		// 一回ループ、行をコントロールする
		for (int i = 1; i <= 10; i++) {
			// 二回ループ、列をコントロールする
			for (int j = 10; j > 0; j--) {
				if (j <= i) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
