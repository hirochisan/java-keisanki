package keisanki;

import java.util.Random;
import java.util.Scanner;

public class keisanki {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rnd = new Random();
		int m = 1;
		while (m == 1) {
			System.out.println("1:足し算_2:引き算_3:掛け算_4:割り算_5:累乗_6:平方根_7:立方根_8:乱数生成");
			int q = scanner.nextInt();
			switch (q) {
			case 1:
				System.out.println("足し算したい数を書いてください");
				double a = scanner.nextFloat();
				System.out.println("+");
				double b = scanner.nextFloat();
				System.out.println("答えは" + (a + b));
				break;
			case 2:
				System.out.println("引き算したい数を書いてください");
				double c = scanner.nextFloat();
				System.out.println("-");
				double d = scanner.nextFloat();
				System.out.println("答えは" + (c - d));
				break;
			case 3:
				System.out.println("かけ算したい数を書いてください");
				double kakerareru = scanner.nextFloat();
				System.out.println("*");
				double kakeru = scanner.nextFloat();
				System.out.println("答えは" + (kakerareru * kakeru));
				break;
			case 4:
				System.out.println("割り算したい数を書いてください");
				double warareru = scanner.nextFloat();
				System.out.println("/");
				double waru = scanner.nextFloat();
				System.out.println("答えは" + (warareru / waru));
				break;
			case 5:
				System.out.println("累乗が知りたい数を書いてください");
				double ruizyou1 = scanner.nextFloat();
				System.out.println("の");
				double ruizyou2 = scanner.nextFloat();
				System.out.println(ruizyou1 + "の" + ruizyou2 + "乗は" + Math.pow(ruizyou1, ruizyou2));
				break;
			case 6:
				System.out.println("平方根が知りたい数を入力してください");
				double heihoukon = scanner.nextFloat();
				System.out.println(heihoukon + "の平方根は" + Math.sqrt(heihoukon));
				break;
			case 7:
				System.out.println("立方根が知りたい数を書いてください");
				double rippoukon = scanner.nextFloat();
				System.out.println(rippoukon + "の立方根は" + Math.cbrt(rippoukon));
				break;
			case 8:
				System.out.println("範囲を指定してください");
				int hani1 = scanner.nextInt();
				System.out.println("~");
				int hani2 = scanner.nextInt();
				int hani3 = hani2 - hani1;
				int random = rnd.nextInt(hani3 + 1) + hani1;
				System.out.println(hani1 + "から" + hani2 + "までの範囲の乱数は" + random);
			}
			System.out.println("0:続ける_1:終わる");
			int l = scanner.nextInt();
			if (l == 1)
				break;

		}
	}
}
